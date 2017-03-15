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

	public LoginDTO select(String phoneEmail, String password){
		System.out.println("ue");
		url =  "openconnect";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		System.out.println("ki");

		String sql = "select user_id, phone_email, login_flg, user_flg ,password from users where  phone_email = ? and password = ?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();
			System.out.println("kayo");

			if(rs.next()){
				dto.setUserId(rs.getString("user_id"));
				dto.setPhoneEmail(rs.getString("phone_email"));
				dto.setLoginFlg(rs.getString("login_flg"));
				dto.setUserFlg(rs.getString("user_flg"));
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

	public ResultSet select2(String phoneEmail, String password){
		url="gochikag2";
		DBConnector db = new DBConnector();
		Connection con =db.getConnection();
		ResultSet rs = null;

		System.out.println("dao2"+phoneEmail);

		//String sql = "select phone_email, password from users where phone_email = ? and password = ?";
		String sql = "select user_id from users where phone_email = ? and password = ?";


		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2, password);

			rs=ps.executeQuery();

			if(rs.next()){
				/*dto.setPhoneEmail(rs.getString("phone_email"));
				dto.setPassword(rs.getString("password"));
				System.out.println(rs.getString("phone_email"));*/

			}


		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }
        return rs;
	}


	public int update(String phoneEmail, String password){
		url="gochikag2";
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
		url="gochikag2";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1,userId);
			ps.setString(2,phoneEmail);
			ps.setString(3,loginFlg);
			ps.setString(4,userFlg);
			ResultSet rs =ps.executeQuery();

			System.out.println("ko");

			System.out.println(userId);

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