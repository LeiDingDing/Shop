/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.netshop.dao;

import it.netshop.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class UserDao {
    public boolean login(String username,String password){
		boolean flag=false;
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String str="select * from users where ulogin=? and upass=?";
		conn=JDBCUtils.getConnection();
		try {
			pst=conn.prepareStatement(str);
			pst.setString(1, username);
			pst.setString(2, password);
			rs=pst.executeQuery();
                        while(rs.next()){
                            flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.closeAll(rs,pst,conn);
		}
		return flag;
	}
        public boolean confirmname(String name){
            boolean flag=false;
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String str="select * from users where ulogin=?";
		conn=JDBCUtils.getConnection();
		try {
			pst=conn.prepareStatement(str);
			pst.setString(1, name);
			rs=pst.executeQuery();
			while(rs.next()){
                            flag=true;
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.closeAll(rs,pst,conn);
		}
		return flag;
        }
        public int QueryUid(String ulogin){
            Connection conn=null;
            PreparedStatement pst=null;
            ResultSet rs=null;
            int uid=0;
            String str="select uid from users where ulogin=?";
            conn=JDBCUtils.getConnection();
            try{
                pst=conn.prepareStatement(str);
                pst.setString(1, ulogin);
                rs=pst.executeQuery();
                while(rs.next()){
                    uid=rs.getInt("uid");
                }
            }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.closeAll(rs,pst,conn);
		}
            return uid;
        }
}
