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
			PreparedStatement ps= con.prepareStatement(sql);
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
        }System.out.println("select");
        return dto;

	}

	/**
	 * @param phoneEmail
	 * @param password
	 * @return
	 * gochikagDBのデータ件数を持ってくる
	 */
	public int count (String phoneEmail, String password){

		url = "gochikag2";
		DBConnector db = new DBConnector(url);
		System.out.println("gochikag2="+db);
		Connection con =db.getConnection();
		int count2 = 0 ;

		String sql = "select count(*) count from users where phone_email = ? and password = ? ";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2, password);

			System.out.println(ps);

			ResultSet rs=ps.executeQuery();
			System.out.println(rs);

			if(rs.next()){
				count2 = rs.getInt("count");
			}
			System.out.println(count2);


		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }System.out.println(count2);
        return count2;
	}


	/**
	 * @param phoneEmail
	 * @param password
	 * @return
	 * GochikagDBのログインフラグをtrueにする
	 */
	public int update(String phoneEmail, String password){

		url="gochikag2";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		int count = 0;

		String sql = "update users set login_flg = true where phone_email = ? and password = ?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2,password);

			count =ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }System.out.println("update");
        return count;
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
		url="gochikag2";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();
		int rs = 0;

		String sql = "insert into  users (user_id, phone_email, login_flg, user_flg, password) values (?, ?, ?, ?, ?)";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
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
        }catch(SQLException e){
        	e.printStackTrace();
        }System.out.println("insert");
        return dto;
	}

}