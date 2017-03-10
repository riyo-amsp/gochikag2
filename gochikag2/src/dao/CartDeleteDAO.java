package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.CartUpdateDTO;
import util.DBConnector;

public class CartDeleteDAO {

	//deleteメソッドの構成　行の削除<table:strage>
	public int delete(int itemId,int userId) throws SQLException{

		//フィールド
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		PreparedStatement ps = null;
		int rs=0;

		/* SQL構文　（★strage2←訂正：strageすること。）
		 * ①user_id,item_idから選び出し削除
		 */
		String sql="delete from strage2 where user_id=? and item_id=?";


		/* try-catch
		 * rs:更新したテーブル内行数
		 */
		try{

			ps=con.prepareStatement(sql);
			ps.setInt(1,userId);
			ps.setInt(2,itemId);

			System.out.println("PS");
			System.out.println(ps);

			rs=ps.executeUpdate();
			System.out.println("RS");
			System.out.println(rs);



		}catch(SQLException e){
			e.printStackTrace();

		}finally{
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}

		return rs;

	}

	//select：メソッド構成
	public List<CartUpdateDTO> select(int userId) throws SQLException{

		//フィールド
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		CartUpdateDTO dto;
		List<CartUpdateDTO> dtoList=new ArrayList<>();
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
			ps.setInt(1,userId);
			ResultSet rs=ps.executeQuery();

			/* CartUpdateDTOにデータを格納
			 * item_name,price,item_count,amount,item_id
			 */
			while(rs.next()){
				dto = new CartUpdateDTO();
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