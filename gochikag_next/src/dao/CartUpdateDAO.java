package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.CartUpdateDTO;
import util.DBConnector;

public class CartUpdateDAO {

	/* update1：数量更新メソッドの構成
	 * 使うもの
	 * item_id,item_count,price,amount,user_id
	 */
	public int update(int itemId,int itemCount,int price,int amount,int userId) throws SQLException{

		//フィールド
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		CartUpdateDTO dto=new CartUpdateDTO();
		PreparedStatement ps = null;
		int rs=0;


		/* SQL構文　（★strage2←訂正：strageすること。）
		 * strage:strage2
		 * --user_id auto_increment & primarykey はずす
		 * --item_id primarykeyはずす
		 * ①item_countの数量更新SQL構文(sql)
		 */
		String sql="update strage2 set item_count=?,amount=? where item_id=? and user_id=?";


		/* try-catch
		 * rs:更新したテーブル内行数
		 */
		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,itemCount);
			ps.setInt(2,itemCount*price);
			ps.setInt(3,itemId);
			ps.setInt(4,userId);
			rs=ps.executeUpdate();

			dto.setAmount(itemCount*price);

		}catch(SQLException e){
			e.printStackTrace();

		} finally{

			if(ps != null) ps.close();
			if(con != null) con.close();

		}
		return rs;

	}


	//select：メソッド構成
	public List<CartUpdateDTO> select(int userId) throws SQLException{

		System.out.println("here");


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
			System.out.println("PS"+ps);
			ps.setInt(1,userId);
			System.out.println("PS2"+ps);
			ResultSet rs=ps.executeQuery();
			System.out.println("RS"+rs);

			/* CartUpdateDTOにデータを格納
			 * item_name,price,item_count,amount,item_id
			 */
			while(rs.next()){
				System.out.println("ss");
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
