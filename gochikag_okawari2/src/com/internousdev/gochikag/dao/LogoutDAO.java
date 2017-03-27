/**
 *
 */
package com.internousdev.gochikag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.gochikag.util.DBConnector;

/**
 * ログインアウトをするクラス
 * @author Kayoko Ueki
 * @since 2017/03/16
 * @version 1.1
 */
public class LogoutDAO {

	/**
	 * gochikagDBのlogin_flgの値をfalseにするメソッド
	 * @param phoneEmail
	 * @param password
	 * @return updateFlg GochikagDBのlogin_flgを値をfalseしようと試みたときの真偽値
	 */
	public boolean updateGochikagLoginFlg(int userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con =db.getConnection();
		PreparedStatement ps = null;
		String sql = "update users set login_flg = false where user_id = ?";
		boolean updateFlg = false;
		try{
			ps= con.prepareStatement(sql);
			ps.setInt(1, userId);
			int rs = ps.executeUpdate();
			if(rs != 0) updateFlg = true;
		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	if(ps != null) ps.close();
        	if(con != null)	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        return updateFlg;
	}

	/**
	 * openconnectDBのlogin_flgの値をfalseにするメソッド
	 * @param phoneEmail
	 * @param password
	 * @return updateFlg OpenConnectDBのlogin_flgを値をfalseしようと試みたときの真偽値
	 */
	public boolean updateOCLoginFlg(int userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con =db.getConnection();
		PreparedStatement ps = null;
		String sql = "update users set login_flg = false where user_id = ?";
		boolean updateFlg = false;
		try{
			ps= con.prepareStatement(sql);
			ps.setInt(1, userId);
			int rs = ps.executeUpdate();
			if(rs != 0) updateFlg = true;
		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        return updateFlg;
	}
}