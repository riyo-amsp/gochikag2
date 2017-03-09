package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;


public class CartUpdateDAO {

	//update1：数量更新メソッドの構成
	public int update1(int item_id,int item_count) throws SQLException{

		//フィールド
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		PreparedStatement ps = null;
		int rs=0;

		/* SQL構文　（★strage2←訂正：strageすること。）
		 * ①item_countの数量更新SQL構文(sql1)
		 */
		String sql1="update strage2 set item_count=? where item_id=?";


		/* try-catch
		 * rs:更新したテーブル内行数
		 */
		try{
			ps=con.prepareStatement(sql1);
			ps.setInt(1,item_count);
			ps.setInt(2,item_id);
			rs=ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();

		} finally{

			if(ps != null) ps.close();
			if(con != null) con.close();

		}
		return rs;

	}


	//update2：数量更新に伴う合計金額の更新メソッド構成
	public int update2(int item_id,int item_count,int amount){

		//フィールド
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		PreparedStatement ps2=null;
		int rs=0;


		/* SQL構文　（★strage2←訂正:strageすること。）
		 * ②amountの数量更新SQL構文(sql2)
		 */
		String sql2="update strage2 set amount=? where item_id?";

		/* try-catch
		 *
		 */
		try{
			ps2=con.prepareStatement(sql2);
			ps2.setInt(1,item_count);
			ps2.setInt(2,amount);
			rs=ps2.executeUpdate();
		}
}

