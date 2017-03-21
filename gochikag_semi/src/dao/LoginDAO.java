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
	String url = null;
	LoginDTO dto = new LoginDTO();
	LoginDTO dto2 = new LoginDTO();
	PreparedStatement ps;

	/**
	 * @param phoneEmail
	 * @param password
	 * @return
	 * openconnectからアドレスとパスワードを持ってくる
	 */
	public LoginDTO select(String phoneEmail, String password){
		url =  "openconnect";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		String sql = "select user_id, phone_email, login_flg, user_flg ,password "
				   + "from users where  phone_email = ? and password = ?";
		try{
			ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();

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
        System.out.println("select_"+"userId="+dto.getUserId()+",password="+dto.getPassword());
        return dto;
	}

	/**
	 * @param phoneEmail
	 * @param password
	 * @return
	 * gochikagDBのデータ件数を持ってくる
	 */
	public int count (String phoneEmail, String password){
		url = "gochikag";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		int count2 = 0 ;
		String sql = "select count(*) count from users where phone_email = ? and password = ? ";

		try{
			ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				count2 = rs.getInt("count");
			}
		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }System.out.println("count2="+count2);
        return count2;
	}
	/**
	 * @param phoneEmail
	 * @param password
	 * @return
	 * GochikagDBのログインフラグをtrueにする
	 */
	public int update(String phoneEmail, String password){

		url="gochikag";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		int flg = 0;
		String sql = "update users set login_flg = true where phone_email = ? and password = ?";
		try{
			ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2,password);
			flg =ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        	ps.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }System.out.println("update_lFlg="+flg);
        return flg;
	}

	/**
	 * @param phoneEmail
	 * @param password
	 * @return
	 * openconnectのログインフラグをtrueにする
	 */
	public int update2(String phoneEmail, String password){

		url="openconnect";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		int flg2 = 0;

		String sql = "update users set login_flg = true where phone_email = ? and password = ?";

		try{
			ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2,password);

			flg2 =ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        	ps.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }System.out.println("update2_lFlg="+flg2);
        return flg2;
	}


	/**
	 * @param userId
	 * @param phoneEmail
	 * @param loginFlg
	 * @param userFlg
	 * @param password
	 * @return
	 * gochikagDBにデータをinsertする
	 */
	public LoginDTO insert(String userId, String phoneEmail, String loginFlg, String userFlg, String password){
		url="gochikag";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		int rs = 0;

		String sql = "insert into  users (user_id, phone_email, login_flg, user_flg, password) values (?, ?, ?, ?, ?)";

		try{
			ps= con.prepareStatement(sql);
			ps.setString(1,userId);
			ps.setString(2,phoneEmail);
			ps.setString(3,loginFlg);
			ps.setString(4,userFlg);
			ps.setString(5, password);
			rs =ps.executeUpdate();

			System.out.println(userId);

		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        	ps.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }System.out.println("insert");
        return dto;
	}

}