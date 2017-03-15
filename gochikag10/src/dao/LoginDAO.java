package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.LoginDTO;
import util.DBConnector;

public class LoginDAO {

	/**
	 *
	 */

	String url;


	LoginDTO dto = new LoginDTO();

	public LoginDTO select(String userId, String phoneEmail, String loginFlg, String userFlg ){

		url =  "openconnect";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();

		String sql = "select user_id, phone_email, login_flg, user_flg, from users where name = ? and email = ?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, phoneEmail);
			ps.setString(3, loginFlg);
			ps.setString(4, userFlg);
			ResultSet rs =ps.executeQuery();

			if(rs.next()){
				dto.setUserId(rs.getString("user_id"));
				dto.setPhoneEmail(rs.getString("email"));
				dto.setLoginFlg(rs.getString("loginFlg"));
				dto.setUserFlg(rs.getString("userFlg"));
			}

		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        return dto;
	}

	public LoginDTO select2(String phoneEmail, String password){

		DBConnector db = new DBConnector();
		Connection con =db.getConnection();

		System.out.println(phoneEmail);

		String sql = "select phone_email, password from users where phone_email = ? and password = ?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();

			if(rs.next()){
				dto.setPhoneEmail(rs.getString("phone_email"));
				dto.setPassword(rs.getString("password"));
			}


		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        return dto;
	}


	public int update(String phoneEmail, String password){

		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		int count = 0;

		String sql = "update users set login_flg = true where phoneEmail = ? and password = ?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(3,password);

			count =ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        return count;
	}

	public LoginDTO insert(String userId, String phoneEmail, String loginFlg, String userFlg){

		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();

		String sql = "insert into  users (user_id, phone_email, login_flg, user_flg) values (?, ?, ?, ?)";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1,userId);
			ps.setString(2,phoneEmail);
			ps.setString(3, loginFlg);
			ps.setString(4, userFlg);
			ResultSet rs =ps.executeQuery();

			if(rs.next()){
				dto.setUserId(rs.getString("user_id"));
				dto.setPhoneEmail(rs.getString("phone_email"));
				dto.setLoginFlg(rs.getString("login_flg"));
				dto.setUserFlg(rs.getString("user_flg"));

			}

		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        return dto;
	}

}