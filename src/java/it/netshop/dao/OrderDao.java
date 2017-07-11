/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.netshop.dao;

import it.netshop.pojo.ArrivalInfo;
import it.netshop.pojo.Cart;
import it.netshop.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class OrderDao {
    //创建订单表
    public void InsertOrder(String fid,String total,ArrivalInfo arrive,int uid){
        Connection conn=null;
        PreparedStatement pst=null;
        String str="insert into forder(fid,ftotal,fname,fphone,faddress,fremark,femail,fpost,uid,sid) values(?,?,?,?,?,?,?,?,?,?)";
        conn=JDBCUtils.getConnection();
        try{
            pst=conn.prepareStatement(str);
            pst.setString(1, fid);
            pst.setString(2,total);
            pst.setString(3, arrive.getShouname());
            pst.setString(4, arrive.getTelephone());
            pst.setString(5, arrive.getAddress());
            pst.setString(6, arrive.getRemark());
            pst.setString(7, arrive.getEmail());
            pst.setString(8, arrive.getPostcode());
            pst.setInt(9, uid);
            pst.setInt(10, 1);
            pst.executeUpdate();
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.close(pst);
                        JDBCUtils.close(conn);
		}
    }
    //创建订单详情
    public void InsertSorder(List<Cart>goodsoncart,String fid){
        Connection conn=null;
        PreparedStatement pst=null;
        String str="insert into sorder(sname,sprice,snumber,fid,gid) values(?,?,?,?,?)";
        conn=JDBCUtils.getConnection();
        try{
            for(Cart c:goodsoncart){
                pst=conn.prepareStatement(str);
                pst.setString(1, c.getGname());
                pst.setFloat(2, c.getGprice());
                pst.setInt(3, c.getGnum());
                pst.setString(4, fid);
                pst.setInt(5, c.getGid());
                pst.executeUpdate();
            }
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.close(pst);
                        JDBCUtils.close(conn);
		}
    }
   //删除购物车中相应商品信息
    public void DeleteSomeGoods(String[]gids,String ulogin){
        Connection conn=null;
       PreparedStatement pst=null;
       String ss=gids[0];
       for(int i=1;i<gids.length;i++){
            ss=ss+","+gids[i];
        }
       String str="delete from shopcart where gid in ("+ss+") and ulogin='"+ulogin+"'";
       conn=JDBCUtils.getConnection();
       try{
           Statement stmt =conn.createStatement();
           stmt.executeUpdate(str);
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
		JDBCUtils.close(pst);
                JDBCUtils.close(conn);
        }
    }
}
