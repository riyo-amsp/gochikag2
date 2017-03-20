
/**
 * 商品情報の検索及び更新、削除用クラス
 *@author Sakamoto
 *@since 2017/03/10
 *
 */


package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.ItemDTO;
import util.DBConnector;

/**
 * @author internousdev
 *
 */
public class AdminItemManageDAO {
	//public ArrayList<ItemDTO> searchList = new ArrayList<ItemDTO>();

	/**
	 *
	 * @param item_name
	 * @param item_id
	 * @return searchList
	 */

	public ArrayList<ItemDTO> select(String category) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<ItemDTO> searchList = new ArrayList<ItemDTO>();

		String sql = "select item_name,item_id,price,stock_number,main_picture,detail_ja "
				    + "from item inner join detail using(item_id) where category=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,category);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setItemName(rs.getString("item_name"));
				dto.setItemId(rs.getInt("item_id"));
				dto.setStockNumber(rs.getInt("stock_number"));
				dto.setPrice(rs.getFloat("price"));
				dto.setMainPicture(rs.getString("main_picture"));
				dto.setDetailJa(rs.getString("detail_ja"));
				//dto.setCategory(rs.getString("category"));
				searchList.add(dto);


			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return searchList;

	}
}