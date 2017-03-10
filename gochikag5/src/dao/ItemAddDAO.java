package dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import util.DBConnector;

public class ItemAddDAO {

	public void itemInsert(String itemName, float price, int itemCount, String registrationDate, String updatedDate,
			String mainPicture, String pictures, String detailJa, String detailEn, String category) {
		DBConnector db = new DBConnector();
		Connection con = null;
		con = db.getConnection();
		String sql1 = "insert into item (item_name, price,registration_date,updated_date,item_count,main_picture, category) values (?,?,?,?,?,?,?)";
		String sql2 = "insert into pictures(pictures) values (?)";
		String sql3 = "insert into detial(detail_ja, detail_en) values (?,?)";

		try {
			PreparedStatement ps1 = (PreparedStatement) con.prepareStatement(sql1);
			ps1.setString(1, itemName);
			ps1.setFloat(2, price);
			ps1.setInt(3, itemCount);
			ps1.setString(4, registrationDate);
			ps1.setString(5, updatedDate);
			ps1.setString(6, mainPicture);
			ps1.setString(7, category);
			ps1.executeUpdate();
			PreparedStatement ps2 = (PreparedStatement) con.prepareStatement(sql2);
			ps2.setString(1,pictures);
			ps2.executeUpdate();
			PreparedStatement ps3 = (PreparedStatement) con.prepareStatement(sql3);
			ps3.setString(1, detailJa);
			ps3.setString(2, detailEn);
			ps3.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


}