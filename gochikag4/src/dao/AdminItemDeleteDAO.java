/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author internousdev
 *
 */
public class AdminItemDeleteDAO {
	public int delete(int item_id){
		int count = 0;
		util.DBConnector db = new util.DBConnector();
		Connection con = null;
		con = db.getConnection();
		String sql = "delete from item where item_id = ?" ;

		try{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1, item_id);
			count = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}
}

