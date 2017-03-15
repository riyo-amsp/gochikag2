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

	public int select(String itemName, String mainPicture, float price, int itemCount, String detailJa) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "select  item_name,item_id,price,item_count,main_picture,detail_ja"
				+ " from item inner join detail using(item_id) where item_id = ?,item_name"
				+ ",price = ?,item_count = ?,main_picture = ?,detail_ja = ?";

		int count = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemName);
			ps.setString(2, mainPicture);
			ps.setFloat(3, price);
			ps.setInt(4, itemCount);
			ps.setString(5, mainPicture);
			ps.setString(6, detailJa);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public  int update(String itemName, String itemId,String mainPicture, float price, int itemCount, String detailJa) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "update item set item_name=?,item_id=?,item_count=?,main_picture=? where item_id=?" ;

		int count = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemName);
			ps.setString(2, itemId);
			ps.setInt(3, itemCount);
			ps.setString(4, mainPicture);

			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
}
