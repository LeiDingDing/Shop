/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.netshop.dao;

import it.netshop.pojo.Category;
import it.netshop.pojo.Goods;
import it.netshop.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Administrator
 */
public class DatabaseImpl {
    public List<Category> QueryAllcate(){
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        List<Category>allcate=new ArrayList<Category>();
        String str="select * from Category";
        conn=JDBCUtils.getConnection();
        try{
            pst=conn.prepareStatement(str);
            rs=pst.executeQuery();
            while(rs.next()){
                Category category=new Category();
                category.setCid(rs.getInt("cid"));
                category.setCtype(rs.getString("ctype"));
                category.setChot(rs.getBoolean("chot"));
                category.setAid(rs.getInt("aid"));
                allcate.add(category);
            }
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.closeAll(rs,pst,conn);
		}
        return allcate;
    }
    public List<Goods> QueryallHot(){
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        List<Goods> allhotgoods=new ArrayList<Goods>();
        String str="select * from goods where giscommend='true' and gisopen='true'";
        conn=JDBCUtils.getConnection();
        try{
            pst=conn.prepareStatement(str);
            rs=pst.executeQuery();
            while(rs.next()){
                Goods hotgoods=new Goods();
                hotgoods.setGid(rs.getInt("gid"));
                hotgoods.setGname(rs.getString("gname"));
                hotgoods.setGprice(rs.getFloat("gprice"));
                hotgoods.setGpic(rs.getString("gpic"));
                hotgoods.setGremark(rs.getString("gremark"));
                hotgoods.setGxremark(rs.getString("gxremark"));
                hotgoods.setGiscommend(rs.getBoolean("giscommend"));
                hotgoods.setGisopen(rs.getBoolean("gisopen"));
                hotgoods.setCid(rs.getInt("cid"));
                allhotgoods.add(hotgoods);
            }
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.closeAll(rs,pst,conn);
		}
        return allhotgoods;
    }
    public List<Goods> QuerySomeGoods(int cid){
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        List<Goods> somegoods=new ArrayList<Goods>();
        String str="select * from goods where gisopen='true' and cid="+cid;
        conn=JDBCUtils.getConnection();
        try{
            pst=conn.prepareStatement(str);
            rs=pst.executeQuery();
            while(rs.next()){
                Goods goods=new Goods();
                goods.setGid(rs.getInt("gid"));
                goods.setGname(rs.getString("gname"));
                goods.setGprice(rs.getFloat("gprice"));
                goods.setGpic(rs.getString("gpic"));
                goods.setGremark(rs.getString("gremark"));
                goods.setGxremark(rs.getString("gxremark"));
                goods.setGiscommend(rs.getBoolean("giscommend"));
                goods.setGisopen(rs.getBoolean("gisopen"));
                goods.setCid(rs.getInt("cid"));
                somegoods.add(goods);
            }
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.closeAll(rs,pst,conn);
		}
        return somegoods;
    }
    public Goods QuerySingleGoods(int gid){
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        String str="select * from goods where gid="+gid;
        Goods goods=new Goods();
        conn=JDBCUtils.getConnection();
        try{
            pst=conn.prepareStatement(str);
            rs=pst.executeQuery();
            while(rs.next()){
                goods.setGid(rs.getInt("gid"));
                goods.setGname(rs.getString("gname"));
                goods.setGprice(rs.getFloat("gprice"));
                goods.setGpic(rs.getString("gpic"));
                goods.setGremark(rs.getString("gremark"));
                goods.setGxremark(rs.getString("gxremark"));
                goods.setGiscommend(rs.getBoolean("giscommend"));
                goods.setGisopen(rs.getBoolean("gisopen"));
                goods.setCid(rs.getInt("cid"));
            }
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.closeAll(rs,pst,conn);
		}
        return goods;
    }
}
