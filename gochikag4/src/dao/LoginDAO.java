package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.LoginDTO;
import util.DBConnector;

public class LoginDAO {
	public LoginDTO select(String name, String password,String user_flg) {
		// System.out.println(name +" SODA " +password);

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();

		String sql = "select user_id,name,password,user_flg from user  where name=? and password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			

			if (rs.next()) {
				dto.setUser_id(rs.getInt("user_id"));
				dto.setName(rs.getString("name"));
				dto.setPassword(rs.getString("password"));
				dto.setUser_flg(rs.getString("user_flg"));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;

	}
}

//	public void  update(String Login_flg) {
//
//		DBConnector db = new DBConnector();
//		Connection con = db.getConnection();
//
//		String sql = "update user set login_flg=1";
//		try {
//			PreparedStatement ps = con.prepareStatement(sql);
//			int rs = ps.executeUpdate();
//
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		try {
//			con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}
//
//}