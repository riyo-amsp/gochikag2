package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.LoginDTO;
import util.DBConnector;
public class LoginDAO {
	public LoginDTO select(String name,String password){
		//System.out.println(name +"  SODA  " +password);
		System.out.println("DAO");
		System.out.println(name);
		System.out.println(password);

		DBConnector db = new DBConnector();
		Connection con =db.getConnection();
		LoginDTO dto = new LoginDTO();

		String sql = "select user_id, name, password from user where name=? and password=?";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();

			if(rs.next()){
				dto.setId(rs.getInt("user_id"));
				dto.setName(rs.getString("name"));
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
}