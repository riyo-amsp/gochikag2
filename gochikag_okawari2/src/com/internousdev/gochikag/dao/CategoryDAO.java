package com.internousdev.gochikag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.gochikag.dto.CategoryDTO;
import com.internousdev.gochikag.util.DBConnector;

/**
 * 各カテゴリー情報を取得するクラス
 * @author Tomohiro Konasaka
 * @since 2017/03/15
 * @version 1.1
 */
public class CategoryDAO {

	/**
	 * カテゴリー情報を取得するメソッド
	 * @param category
	 * @return カテゴリー情報
	 * @throws SQLException
	 */
	public List<CategoryDTO> select(String category) throws SQLException{
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","gochikag","root","mysql");
		Connection con = db.getConnection();
		PreparedStatement ps= null;
		int itemCount = 0;
		CategoryDTO dto;
		List<CategoryDTO> dtoList = new ArrayList<CategoryDTO>();

		String sql = "select item_id, item_name, price, main_picture from item where category = ? and stock_number >= 1";

		try{
			ps= con.prepareStatement(sql);
			ps.setString(1, category);
			ResultSet rs =ps.executeQuery();

			while(rs.next()){
				dto = new CategoryDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setPrice(rs.getInt("price"));
				dto.setUrl(rs.getString("main_picture"));
				dto.setItemCount(itemCount);
				dtoList.add(dto);
				itemCount ++;
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
