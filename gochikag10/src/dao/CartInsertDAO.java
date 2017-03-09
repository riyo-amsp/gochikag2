/**
 *
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.CartInsertDTO;
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
	CartInsertDTO dto = new CartInsertDTO();
	ArrayList<CartInsertDTO> dtoList = new ArrayList<CartInsertDTO>();
	public ArrayList<CartInsertDTO> select(String itemId,String itemCount){
		String sql = "select item_id,item_count from strage2;";
		try{

			PreparedStatement ps = con.prepareStatement(itemCount);
			ps.setString(1,itemId);
			ps.setString(2,itemCount);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dto = new CartInsertDTO();
				dto.setItemId(rs.getString("itemId"));
				dto.setItemCount(rs.getString("itemCount"));
				dtoList.add(dto);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	return dtoList;
	}

	public ArrayList<CartInsertDTO> update(String itemId,String itemCount){
		String sql = "update strage2 set item_count=2, item_id=3;";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,itemId);
			ps.setString(2,itemCount);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dto = new CartInsertDTO();
				dto.setItemId(rs.getString("itemId"));
				dto.setItemCount(rs.getString("itemCount"));
				dtoList.add(dto);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	return dtoList;
	}

}

