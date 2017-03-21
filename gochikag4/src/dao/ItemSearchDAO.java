package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import dto.ItemSearchDTO;
import util.DBConnector;

public class ItemSearchDAO {



	public ArrayList<ItemSearchDTO> itemList = new ArrayList<ItemSearchDTO>();

	public ArrayList<ItemSearchDTO> select(String searchItem, int searchSort) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();


		String sql = null;

		switch (searchSort) {
		case 1:
			sql =" select item_name, price, main_picture, registration_date from item where category = 'kagu' order by price ASC";
			break;
		case 2:
			sql = "select item_name, price, main_picture, registration_date from item where category = 'kagu' order by price DESC";
			break;
		case 3:
			sql = "select item_name, price, main_picture, registration_date from item where category = 'kagu' order by registration_date ASC";
			break;
		case 4:
			sql = "select item_name, price, main_picture, registration_date from item where category = 'kagu' order by registration_date DESC";
			break;
		case 5:
			sql = "select item_name, price, main_picture, registration_date from item where category = 'kagu' and price between 0 and 2499 order by price ASC";
			break;
		case 6:
			sql = "select item_name, price, main_picture, registration_date from item where category = 'kagu' and price between 3000 and 5000 order by price ASC";
			break;
		}
		System.out.println(sql + "sql");
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

			int tk = 0;
			switch (tk) {
			case 1:
				ps.setString(1, "%" + searchItem + "%");
				break;
			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemSearchDTO dto = new ItemSearchDTO();
				dto.setItemName(rs.getString("item_name"));
				System.out.println("item_name");
				dto.setPrice(rs.getFloat("price"));
				dto.setMainPicture(rs.getString("main_picture"));
				dto.setRegistrationDate(rs.getString("registration_date"));
				itemList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return itemList;
	}

}
