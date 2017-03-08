/**
 *
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.ItemDTO;
import util.DBConnector;

/**
 * @author internousdev
 *
 */
public class ItemDAO {

	public ItemDTO select(String itemName) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		ItemDTO dto = new ItemDTO();

		String sql = "select * from item inner join pictures on item.item_id = pictures.item_id inner join detail on detail.item_id = item.item_id where= item_name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, itemName);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto.setItem_id(rs.getInt("item_id"));
				dto.setItem_name(rs.getString("item_name"));
			    dto.setMain_pictures(rs.getString("main_picture"));
				dto.setPictures(rs.getString("price"));
				dto.setPrice(rs.getFloat("detail_ja"));
				dto.setItem_count(rs.getInt("item_count"));
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
