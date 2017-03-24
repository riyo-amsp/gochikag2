package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.ItemSearchDTO;
import util.DBConnector;

public class ItemSearchDAO {



	public ArrayList<ItemSearchDTO> itemList = new ArrayList<ItemSearchDTO>();

	public ArrayList<ItemSearchDTO> select(int searchSort) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		ItemSearchDTO dto = new ItemSearchDTO();

		String sql ="select item_name, price, main_picture, registration_date from item where category = ?";

		switch (searchSort) {
		case 1:
			sql = sql + "order by price ASC";
			break;
		case 2:
			sql = sql + "order by price DESC";
			break;
		case 3:
			sql = sql + "order by registration_date ASC";
			break;
		case 4:
			sql = sql + "order by registration_date DESC";
			break;
		case 5:
			sql = sql + "and price between 0 and 2499 order by price ASC";
			break;
		case 6:
			sql = sql + "and price between 3000 and 5000 order by price ASC";
			break;
		}
		System.out.println(sql + "sql");
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setItemName(rs.getString("item_name"));
				dto.setMainPicture(rs.getString("main_picture"));
				dto.setPrice(rs.getFloat("price"));
				dto.setCategory(rs.getString("category"));
				System.out.println("category");
				itemList.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return itemList;
	}

}