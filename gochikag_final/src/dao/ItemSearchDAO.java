package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.ItemSearchDTO;
import util.DBConnector;

public class ItemSearchDAO {


	public List<ItemSearchDTO> itemList = new ArrayList<ItemSearchDTO>();
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	ItemSearchDTO dto = new ItemSearchDTO();
	String sql = null;

	public List<ItemSearchDTO> select(String category, int searchSort) {

			System.out.println(category);
			System.out.println(searchSort);


			sql ="select item_name, price, main_picture, registration_date from item where category = ? ";

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

			System.out.println("SQL");
			System.out.println(sql);

			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, category);
				System.out.println("PS");
				System.out.println(ps);

				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					dto.setItemName(rs.getString("item_name"));
					dto.setPrice(rs.getFloat("price"));
					dto.setMainPicture(rs.getString("main_picture"));
					dto.setRegistrationDate(rs.getString("registration_date"));
					itemList.add(dto);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}

		return itemList;
		}

}