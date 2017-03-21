package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.DBConnector;

public class CartDeleteDAO {
	public int delete(int itemId,int userId) throws SQLException{
		//フィールド
		DBConnector db=new DBConnector("gochikag");
		Connection con=db.getConnection();
		PreparedStatement ps = null;
		int rs = 0;
		String sql="delete from cart2 where user_id=? and item_id=?";
		
		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,userId);
			ps.setInt(2,itemId);
			con.setAutoCommit(false);
			rs=ps.executeUpdate();
			con.commit();
			System.out.println("CartDeleteDAO");
		}catch(SQLException e){
			con.rollback();
			e.printStackTrace();
		}finally{
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}
		return rs;
	}
}