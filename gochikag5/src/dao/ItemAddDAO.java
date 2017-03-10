package dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import util.DBConnector;

public class ItemAddDAO {

	public int insert(String itemName, float price, int itemCount, String registrationDate, String updatedDate, String mainPicture, String pictures, String detailJa, String detailEn) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","gochikag","root","mysql");
		Connection con = null;
		con = db.getConnection();
		int count = 0;
		String sql = "insert into item (item_name, price,registration_date,updated_date,item_count,main_picture) values (?,?,?,?,?,?)";


				try{
					PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
					ps.setString(1, itemName);
					ps.setFloat(2, price);
					ps.setInt(3, itemCount);
					ps.setString(4, registrationDate);
					ps.setString(5, updatedDate);
					ps.setString(6, mainPicture);
					ps.setString(7, pictures);
					ps.setString(8, detailJa);
					ps.setString(9, detailEn);
					count = ps.executeUpdate();
				}catch (SQLException e) {
					e.printStackTrace();
				}finally{
					try{
						con.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
				return count;
			}
}
