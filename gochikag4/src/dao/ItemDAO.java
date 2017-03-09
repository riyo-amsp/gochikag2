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

	public ItemDTO select(int item_id) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		ItemDTO dto = new ItemDTO();

		String sql = "select item_id,item_name,main_picture,price,detail_ja,item_count,pictures from (item inner join detail using(item_id)) inner join pictures using(item_id) where item_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, item_id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getInt("item_id"));
				System.out.println(rs.getString("item_name"));
				System.out.println(rs.getString("main_picture"));
				System.out.println(rs.getString("detail_ja"));
				System.out.println(rs.getFloat("price"));
				System.out.println(rs.getInt("item_count"));
				System.out.println(rs.getString("pictures"));

				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
			    dto.setMainPicture(rs.getString("main_picture"));
				dto.setDetailJa(rs.getString("detail_ja"));
				dto.setPrice(rs.getFloat("price"));
				dto.setItemCount(rs.getInt("item_count"));
				dto.setPictures(rs.getString("pictures"));

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
