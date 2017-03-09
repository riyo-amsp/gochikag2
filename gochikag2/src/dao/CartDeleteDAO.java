package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;


public class CartDeleteDAO {

	//deleteメソッドの構成　行の削除<table:strage>
	public int delete(int item_id,int user_id) throws SQLException{

		//フィールド
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		PreparedStatement ps = null;
		int rs=0;

		/* SQL構文　（★strage2←訂正：strageすること。）
		 * ①user_id=1(session?)かつ、item_id=?の場合削除
		 */
		String sql="drop strage2 where item_id=? and user_id=?";


		/* try-catch
		 * rs:更新したテーブル内行数
		 */
		try{

			ps=con.prepareStatement(sql);
			ps.setInt(1,item_id);
			ps.setInt(2, user_id);

			rs=ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();

		}finally{
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}

		return rs;

	}
}