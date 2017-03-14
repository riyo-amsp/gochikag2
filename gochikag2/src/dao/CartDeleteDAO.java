package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}