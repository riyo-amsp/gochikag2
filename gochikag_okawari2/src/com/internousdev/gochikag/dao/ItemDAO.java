/**
 *
 */
package com.internousdev.gochikag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.gochikag.dto.ItemDTO;
import com.internousdev.gochikag.util.DBConnector;

/**
 *
 * @author Tomohiro Konasaka
 * @since 2017/03/15
 * @version 1.1
 */
public class ItemDAO {
	/**
	 * 商品情報を取得するメソッド
	 * @param item_id 商品ID
	 * @return ItemDTO 商品情報
	 */
	public ItemDTO select(int item_id) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","gochikag","root","mysql");
		Connection con = db.getConnection();
		PreparedStatement ps = null;
		ItemDTO dto = new ItemDTO();
		String sql = "select item_id, item_name, main_picture, price, detail_ja, detail_en, stock_number, sub_picture1, sub_picture2, sub_picture3 "
				   + "from (item inner join detail using(item_id)) inner join pictures using(item_id) where item_id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, item_id);
			ResultSet rs = ps.executeQuery();
			dto.setItemFlg(false);
			if (rs.next()) {
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
			    dto.setMainPicture(rs.getString("main_picture"));
				dto.setDetailJa(rs.getString("detail_ja"));
				dto.setDetailEn(rs.getString("detail_en"));
				dto.setPrice(rs.getInt("price"));
				dto.setStockNumber(rs.getInt("stock_number"));
				dto.setSubPicture1(rs.getString("sub_picture1"));
				dto.setSubPicture2(rs.getString("sub_picture2"));
				dto.setSubPicture3(rs.getString("sub_picture3"));
				dto.setItemFlg(true);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(ps != null) ps.close();
			if(con != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
}
