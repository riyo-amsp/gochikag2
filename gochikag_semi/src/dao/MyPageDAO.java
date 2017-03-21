package dao;

import dto.CategoryDTO;
import dto.MyPageDTO;
import util.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class MyPageDAO {
	public List<MyPageDTO> select(int userId) throws SQLException{
		DBConnector db = new DBConnector("gochikag");
		Connection con = db.getConnection();
		MyPageDTO dto;
		List<MyPageDTO> dtoList = new ArrayList<MyPageDTO>();
		PreparedStatement ps = null;
		String sql = "select purchase_date, item_name, amount from purchase "
				   + "inner join item using(item_id) where user_id = ?";
		try{
			ps= con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()){
				dto = new MyPageDTO();
				dto.setDate(rs.getString("purchase_date"));
				dto.setItemName(rs.getString("item_name"));
				dto.setAmount(rs.getInt("amount"));
				dtoList.add(dto);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			if(con != null) con.close();
			if(ps != null) ps.close();
		}
		return dtoList;
	}	
}
