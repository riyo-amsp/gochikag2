package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.CartSelectDTO;
import util.DBConnector;

public class CartSelectDAO {


	//selectメソッド構成
	public List<CartSelectDTO> select(int userId) throws SQLException{

		//フィールド
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		CartSelectDTO dto;
		List<CartSelectDTO> dtoList = new ArrayList<>();
		PreparedStatement ps=null;
		/* SQL構文　（★strage2←訂正:strageすること。）
		 * ②表作成のための値の取得
		 */
		String sql="select item_name,price,strage2.item_count,amount from item "
				+ "inner join strage2 using(item_id) where user_id=?";

		/* try-catch
		 *
		 */

		try{
			ps=con.prepareStatement(sql);
			System.out.println("PS"+ps);
			ps.setInt(1,userId);
			System.out.println("PS2"+ps);
			ResultSet rs=ps.executeQuery();
			System.out.println("RS"+rs);

			/* CartSelectDTOにデータを格納
			 * item_name,price,item_count,amount,item_id
			 */
			while(rs.next()){
				System.out.println("ss");
				dto = new CartSelectDTO();
				dto.setItemName(rs.getString("item_name"));
				dto.setPrice(rs.getInt("price"));
				dto.setItemCount(rs.getInt("item_count"));
				dto.setAmount(rs.getInt("amount"));

				dtoList.add(dto);

			}

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			if(ps != null) ps.close();
			if(con != null) con.close();
		}

		return dtoList;

		}

}
