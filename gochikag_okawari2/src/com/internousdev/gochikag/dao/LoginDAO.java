package com.internousdev.gochikag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.gochikag.dto.LoginDTO;
import com.internousdev.gochikag.util.DBConnector;

/**
 * ログイン情報を取得するクラス
 * @author Kayoko Ueki
 * @since 2017/03/16
 * @version 1.1
 */
public class LoginDAO {

	/**
	 * openconnectから情報を取得するメソッド
	 * @param phoneEmail アドレス
	 * @param password パスワード
	 * @return LoginDTO ログイン情報
	 */
	public LoginDTO select(String phoneEmail, String password){
		String url = "openconnect";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		PreparedStatement ps = null;
		LoginDTO dto = new LoginDTO();
		
		String sql = "select user_id, phone_email, login_flg, user_flg ,password "
				   + "from users where phone_email = ? and password = ?";
		try{
			ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				dto.setUserId(rs.getInt("user_id"));
				dto.setPhoneEmail(rs.getString("phone_email"));
				dto.setLoginFlg(rs.getString("login_flg"));
				dto.setUserFlg(rs.getString("user_flg"));
				dto.setPassword(rs.getString("password"));
			}
		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	if(ps != null) ps.close();
        	if(con != null) con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        return dto;
	}

	/**
	 * gochikagDBに顧客情報があるか確認するメソッド
	 * @param phoneEmail アドレス
	 * @param password パスワード
	 * @return userFlg gochikagDBに顧客情報があるかの真偽値
	 */
	public boolean checkUserExistence (String phoneEmail, String password){
		String url = "gochikag";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		PreparedStatement ps = null;
		boolean userFlg = false;
		String sql = "select count(*) count from users where phone_email = ? and password = ? ";

		try{
			ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				if(rs.getInt("count") != 0) userFlg = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	if(ps != null) ps.close();
        	if(con != null) con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        return userFlg;
	}
	
	
	/**
	 * GochikagDBのログインフラグをtrueにするメソッド
	 * @param phoneEmail アドレス
	 * @param password パスワード
	 * @return updateFlg gochikagDBのupdate後のloginFlgの真偽値
	 */
	public boolean updateGochikagLoginFlg(String phoneEmail, String password){
		String url="gochikag";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		PreparedStatement ps = null;
		int rs = 0;
		boolean updateFlg = true;
		String sql = "update users set login_flg = true where phone_email = ? and password = ?";
		try{
			ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2,password);
			rs =ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	if(ps != null) ps.close();
        	if(con != null) con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        if(rs != 0) updateFlg = true;
        return updateFlg;
	}

	
	/**
	 * @param phoneEmail
	 * @param password
	 * @return updateFlg OpenConnectDBのupdate後のloginFlgの真偽値
	 */
	public boolean updateOCLoginlg(String phoneEmail, String password){

		String url="openconnect";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		PreparedStatement ps = null;
		int rs = 0;
		boolean updateFlg = true;
		String sql = "update users set login_flg = true where phone_email = ? and password = ?";

		try{
			ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2,password);
			rs =ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	if(ps != null) ps.close();
        	if(con != null) con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        if(rs != 0) updateFlg = true;
        return updateFlg;
	}

	/**
	 * gochikagDBに情報をinsertするメソッド
	 * @param userId 顧客ID
	 * @param phoneEmail アドレス
	 * @param loginFlg ログインフラグ
	 * @param userFlg ユーザーフラグ
	 * @param password パスワード
	 * @return insertFlg 値の挿入に成功したかどうかの真偽値
	 */
	public boolean insertIntoUsers(int userId, String phoneEmail, String loginFlg, String userFlg, String password){
		String url="gochikag";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		PreparedStatement ps = null;
		int rs = 0;
		boolean insertFlg = false;
		String sql = "insert into  users (user_id, phone_email, login_flg, user_flg, password) values (?, ?, ?, ?, ?)";
		try{
			ps= con.prepareStatement(sql);
			ps.setInt(1,userId);
			ps.setString(2,phoneEmail);
			ps.setString(3,loginFlg);
			ps.setString(4,userFlg);
			ps.setString(5, password);
			rs =ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	if(ps != null) ps.close();
        	if(con != null) con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        if(rs != 0) insertFlg = true;
        return insertFlg;
	}
	
	/**
	 * @param itemId
	 * @param userId
	 * @return deleteFlg gochikagDBのcartテーブルのデータの削除をした時の結果の真偽値
	 * @throws SQLException
	 */
	public void delete(int userId) throws SQLException{
		String url="gochikag";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		PreparedStatement ps = null;
		String sql = "delete from cart2 where user_id = ?";
		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,userId);
			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}
	}
}