
/**
 *
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.DBConnector;

/**
 *
 */

/**
 * @author internousdev
 *
 */
public class CartInsertDAO {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	int rs = 0;
	
	public int insert(int userId, int itemId,int itemCount,int amount){
		String sql = "insert into strage2 (user_id, item_id, item_count, amount) values(?, ?, ?, ?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2,itemId);
			ps.setInt(3, itemCount);
			ps.setInt(4, amount);
			
			int rs = ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	return rs;
	}
}
