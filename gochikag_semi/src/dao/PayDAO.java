package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.DBConnector;

public class PayDAO {
	
	public boolean update(int userId) throws SQLException{
		Connection con = new DBConnector("gochikag").getConnection();
		PreparedStatement ps = null;
		int rs = 0;
		String sql = "update cart2 set cart_flg = true where user_id = ?";
		boolean checkCartFlag = false;
		
		try{
			ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			con.setAutoCommit(false);
			rs = ps.executeUpdate();
			con.commit();
			if(rs != 0) checkCartFlag = true;
			
		}catch(SQLException e){
			con.rollback();
			e.printStackTrace();
		}finally{
			if(ps != null) ps.close();
			if(con != null) con.close();
		}
		return checkCartFlag;
	}
	
	
}
