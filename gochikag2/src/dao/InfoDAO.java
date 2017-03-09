package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;

public class InfoDAO{

	public int  insert(String name,String email,String info) throws SQLException{
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	PreparedStatement ps=null;
	int rs=0;
	String sql = "insert into info (name,email,info) values(?, ?, ?)";
	//sql = insert into info values(name = ?);
	//sql = insert into info values(?, ?, ?);

		try{
			ps = con.prepareStatement(sql);
			System.out.println(name);
			System.out.println(email);
			System.out.println(info);
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,info);
			rs = ps.executeUpdate();
			System.out.println(rs);

		} 	catch(SQLException e)	{
			e.printStackTrace();
		}
		try{
			if(con != null) con.close();
			if(ps != null) ps.close();
		}	catch(SQLException e)	{
			e.printStackTrace();
		}
		return rs;
	}
}