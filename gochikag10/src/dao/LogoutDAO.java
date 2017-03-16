/**
 *
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.LoginDTO;
import util.DBConnector;

/**
 * @author internous
 *
 */
public class LogoutDAO {

	String url = null;
	int flg;
	int flg2;

	LoginDTO dto = new LoginDTO();
	LoginDTO dto2 = new LoginDTO();

	/**
	 * @param phoneEmail
	 * @param password
	 * @return
	 * gochikagDBのlogin_flgをfalseに更新
	 */
	public int update(String phoneEmail, String password){

		url="gochikag2";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();

		String sql = "update users set login_flg = false where phone_email = ? and password = ?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2,password);

			flg =ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }System.out.println("daoUp="+flg);
        return flg;
	}

	/**
	 * @param phoneEmail
	 * @param password
	 * @return
	 * openconnectのlogin_flgをfalseに更新
	 */
	public int update2(String phoneEmail, String password){

		url="openconnect";
		DBConnector db = new DBConnector(url);
		Connection con =db.getConnection();

		String sql = "update users set login_flg = false where phone_email = ? and password = ?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, phoneEmail);
			ps.setString(2,password);

			flg2 =ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
        }try{
        	con.close();
        }catch(SQLException e){
        	e.printStackTrace();
        }System.out.println("daoUp2"+flg2);
        return flg2;
	}
}
