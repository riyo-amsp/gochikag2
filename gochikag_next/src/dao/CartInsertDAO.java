
/**
 *
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import util.DBConnector;



/**
 * @author internousdev
 *
 */
public class CartInsertDAO {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	int rs = 0;
	PreparedStatement ps=null;
	
	public int insert(int userId, int itemId,int itemCount,int amount){
		String sql = "insert into strage2 (user_id, item_id, item_count, amount) values(?, ?, ?, ?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2,itemId);
			ps.setInt(3, itemCount);
			ps.setInt(4, amount);
			
			rs = ps.executeUpdate();
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
	
	public List<Integer> select(int userId, int itemId){
		String sql = "select item_id from strage2 where user_id = ? and item_id = ? ";
		List<Integer> itemIdList = new ArrayList<Integer>();
		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,userId);
			ps.setInt(2,itemId);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				itemIdList.add(rs.getInt("item_id"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return itemIdList;
	}
}
