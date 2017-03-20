/**
 *
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;

/**
 * @author internousdev
 *
 */
public class AdminItemUpdateDAO {

	public int select(String itemName, String mainPicture, float price, int stockNumber, String detailJa) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "select  item_name,item_id,price,stock_number,main_picture,detail_ja"
				+ " from item inner join detail using(item_id) where item_id = ?,item_name"
				+ ",price = ?,stock_number = ?,main_picture = ?,detail_ja = ?";

		int count = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemName);
			ps.setString(2, mainPicture);
			ps.setFloat(3, price);
			ps.setInt(4, stockNumber);
			ps.setString(5, mainPicture);
			ps.setString(6, detailJa);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public  int update(float price, int stockNumber,int itemId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "update item set stock_number=?,price=? where item_id=?" ;

		int count = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, stockNumber);
			ps.setFloat(2, price);
			ps.setInt(3, itemId);

			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
}
