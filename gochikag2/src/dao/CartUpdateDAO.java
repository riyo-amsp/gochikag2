package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.CartSelectDTO;
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
		CartSelectDTO dto=new CartSelectDTO();
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


}
