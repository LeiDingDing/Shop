/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.netshop.dao;

import it.netshop.pojo.Cart;
import it.netshop.pojo.Goods;
import it.netshop.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CartDao {
    public List<Cart> QueryShopCart(String ulogin){
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        List<Cart>allgoodsOnCart=new ArrayList<Cart>();
        String str="select * from shopcart where ulogin='"+ulogin+"'";
        conn=JDBCUtils.getConnection();
        try{
            pst=conn.prepareStatement(str);
            rs=pst.executeQuery();
            while(rs.next()){
                Cart cart=new Cart();
                cart.setGid(rs.getInt("gid"));
                cart.setGname(rs.getString("gname"));
                cart.setGprice(rs.getFloat("gprice"));
                cart.setGnum(rs.getInt("gnum"));
                cart.setUlogin(rs.getString("ulogin"));
                cart.setGpic(rs.getString("gpic"));
                allgoodsOnCart.add(cart);
            }
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.closeAll(rs,pst,conn);
		}
        return allgoodsOnCart;
    }
    //通过in(?,?)批量查询
    public List<Cart> QueryGoodsByids(String[] gids,String ulogin){
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        String ss=gids[0]; 
        for(int i=1;i<gids.length;i++){
            ss=ss+","+gids[i];
        }
        List<Cart>allgoodsOnCart=new ArrayList<Cart>();
        String str="select * from shopcart where ulogin='"+ulogin+"' and gid in ("+ss+")";
        conn=JDBCUtils.getConnection();
        try{
            
            Statement stmt =conn.createStatement();
            rs=stmt.executeQuery(str);
            while(rs.next()){
                Cart cart=new Cart();
                cart.setGid(rs.getInt("gid"));
                cart.setGname(rs.getString("gname"));
                cart.setGprice(rs.getFloat("gprice"));
                cart.setGnum(rs.getInt("gnum"));
                cart.setUlogin(rs.getString("ulogin"));
                cart.setGpic(rs.getString("gpic"));
                allgoodsOnCart.add(cart);
            }
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.closeAll(rs,pst,conn);
		}
        return allgoodsOnCart;
    }
    //通过购物车中产品id和用户查询商品
    public List<Cart> QueryShopCartbygid(int gid,String ulogin){
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        List<Cart>allgoodsOnCart=new ArrayList<Cart>();
        String str="select * from shopcart where ulogin=? and gid=?";
        conn=JDBCUtils.getConnection();
        try{
            pst=conn.prepareStatement(str);
            pst.setString(1, ulogin);
            pst.setInt(2, gid);
            rs=pst.executeQuery();
            while(rs.next()){
                Cart cart=new Cart();
                cart.setGid(rs.getInt("gid"));
                cart.setGname(rs.getString("gname"));
                cart.setGprice(rs.getFloat("gprice"));
                cart.setGnum(rs.getInt("gnum"));
                cart.setUlogin(rs.getString("ulogin"));
                cart.setGpic(rs.getString("gpic"));
                allgoodsOnCart.add(cart);
            }
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.closeAll(rs,pst,conn);
		}
        return allgoodsOnCart;
    }
    public void InsertGoodsToCart(Goods goods,String user){
        Connection conn=null;
        PreparedStatement pst=null;
        PreparedStatement pst2=null;
        String str="insert into shopcart values(?,?,?,?,?,?)";
        String upstr="update shopcart set gnum=gnum+1 where gid=? and ulogin=?";
        conn=JDBCUtils.getConnection();
        if(QueryShopCartbygid(goods.getGid(), user).size()>0){
            try{
                    pst2=conn.prepareStatement(upstr);
                    pst2.setInt(1, goods.getGid());
                    pst2.setString(2, user);
                    pst2.executeUpdate();
                }catch(SQLException e){
                        e.printStackTrace();
                }finally{
			JDBCUtils.close(pst);
                        JDBCUtils.close(conn);
                }
        }else{
                try{
                    pst=conn.prepareStatement(str);
                    pst.setInt(1, goods.getGid());
                    pst.setString(2, goods.getGname());
                    pst.setFloat(3, goods.getGprice());
                    pst.setInt(4, 1);
                    pst.setString(5, user);
                    pst.setString(6, goods.getGpic());			
                    pst.executeUpdate();
                }catch(SQLException e){
                        e.printStackTrace();
                }finally{
			JDBCUtils.close(pst);
                        JDBCUtils.close(conn);
                }
                   
        }
       
    }
    
    public void DeleteGoodsOnCart(int gid,String user){
       Connection conn=null;
       PreparedStatement pst=null;
       String str="delete from shopcart where gid=? and ulogin=?";
       conn=JDBCUtils.getConnection();
       try{
           pst=conn.prepareStatement(str);
           pst.setInt(1, gid);
           pst.setString(2, user);
           pst.executeUpdate();
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
		JDBCUtils.close(pst);
                JDBCUtils.close(conn);
        }
    } 
}
