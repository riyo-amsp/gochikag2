



package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.ItemDTO;
import util.DBConnector;
/**
 *AdminItemManageDAO 商品情報の検索用クラス
 *@author Yoshikazu Sakamoto
 *@since 2017/03/10
 *@version 1.1
 */
public class AdminItemManageDAO {

	public ArrayList<ItemDTO> searchList = new ArrayList<ItemDTO>();

	/**
	 * カテゴリから商品情報を取得するメソッド
	 * @param item_name 商品名
	 * @param item_id 商品ID
	 * @return searchList 商品の検索結果
	 * @throws  SQLException
	 */

	public ArrayList<ItemDTO> select1(String category) throws SQLException{

		//gochikagDBに接続
		DBConnector db = new DBConnector("gochikag");
		Connection con = db.getConnection();
		ArrayList<ItemDTO> nameList = new ArrayList<ItemDTO>();

		/*String sql = "select item_name,item_id,price,stock_number,main_picture,detail_ja "
			    		+ "from item inner join detail using(item_id) where category=?";*/
		String sql = "select item_name, item_id from item where category = ?";

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
				nameList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return searchList;

	}
}
