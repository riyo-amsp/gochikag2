package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBConnector;


public class CartUpdateDAO {

	/* update1：数量更新メソッドの構成
	 * 使うもの
	 * item_id,item_count,price,amount,user_id
	 */
	public int update(int item_id,int item_count,int price,int amount,int user_id) throws SQLException{

		//フィールド
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
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
			ps.setInt(1,item_count);
			ps.setInt(2,item_count*price);
			ps.setInt(3,item_id);
			ps.setInt(4,user_id);
			rs=ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();

		} finally{

			if(ps != null) ps.close();
			if(con != null) con.close();

		}
		return rs;

	}


	//select：メソッド構成
	public int select(int item_id,int user_id) throws SQLException{

		//フィールド
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		PreparedStatement ps=null;


		/* SQL構文　（★strage2←訂正:strageすること。）
		 * ②amountの数量更新SQL構文(sql2)
		 */
		String sql="select item_name,price,item_count,amount from item "
				+ "inner join strage2 on item.item_id=strage2.item_id where user_id=?";

		/* try-catch
		 *
		 */

		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,item_id);
			ResultSet rs=ps.executeQuery();

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			if(ps != null) ps.close();
			if(con != null) con.close();
		}

		return rs;

		}
}

