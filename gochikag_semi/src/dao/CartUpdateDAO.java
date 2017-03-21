package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.DBConnector;

public class CartUpdateDAO {
	public int update(int itemId,int itemCount,int price,int amount,int userId) throws SQLException{
		//フィールド
		DBConnector db=new DBConnector("gochikag");
		Connection con=db.getConnection();
		PreparedStatement ps = null;
		int rs=0;
		String sql="update cart2 set item_count=?,amount=? where item_id=? and user_id=?";
		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,itemCount);
			ps.setInt(2,itemCount * price); //amountを設定する
			ps.setInt(3,itemId);
			ps.setInt(4,userId);
			con.setAutoCommit(false);
			rs=ps.executeUpdate();
			con.commit();

		}catch(SQLException e){
			con.rollback();
			e.printStackTrace();
		} finally{
			if(ps != null) ps.close();
			if(con != null) con.close();
		}
		return rs;
	}
}
