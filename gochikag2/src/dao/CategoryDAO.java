package dao;

import dto.CategoryDTO;
import util.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class CategoryDAO {
	
	public List<CategoryDTO> select(String category) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		PreparedStatement ps= null;
		
		CategoryDTO dto;
		List<CategoryDTO> dtoList = new ArrayList<CategoryDTO>();
		
		String sql = "select item_name, price, main_picture from item where category = ?";
		
		try{
			ps= con.prepareStatement(sql);
			ps.setString(1, category);
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()){
				dto = new CategoryDTO();
				dto.setItemName(rs.getString("item_name"));
				dto.setPrice(rs.getInt("price"));
				dto.setUrl(rs.getString("main_picture"));
				dtoList.add(dto);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(ps != null) ps.close();
			if(con != null) con.close();
		}
		return dtoList;
	}

}
