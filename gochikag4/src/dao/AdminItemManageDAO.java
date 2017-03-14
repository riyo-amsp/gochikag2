
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
	public ArrayList<ItemDTO> searchList = new ArrayList<ItemDTO>();

	/**
	 *
	 * @param item_name
	 * @param item_id
	 * @return searchList
	 */

	public ArrayList<ItemDTO> select(String SearchItem_name, int SearchItem_id) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select item_name,item_id,price,item_count,main_pictures,detail_ja from item where item_name=? and item_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, SearchItem_name);
			ps.setInt(2, SearchItem_id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setItemName(rs.getString("item_name"));
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemCount(rs.getInt("item_count"));
				dto.setPrice(rs.getFloat("price"));
				dto.setMainPicture(rs.getString("main_pictures"));
				dto.setDetailJa(rs.getString("detail_ja"));
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return searchList;

	}
}