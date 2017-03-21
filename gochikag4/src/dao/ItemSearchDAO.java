package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import util.DBConnector;

public class ItemSearchDAO {
	

	
	public ArrayList<ItemSearchDTO> select(String searchName, int searchSort){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		 ArrayList<ItemSearchDTO> itemList = new ArrayList<ItemSearchDTO>();
	 
		 int tk = 0;
		 if (searchName.length() !=0) {
			 tk = 0;
			 @SuppressWarnings("unused")
			String sql = "select * from item where name LIKE ?";
		 }
		 String sql = null;
		switch(searchSort){
		 case 1:
			 sql=sql+"ORDER by price ASC";
			 break;
		 case 2:
			 sql=sql+"ORDER by price DESC";
			 break;
		 case 3:
			 sql=sql+"ORDER by registrationDate ASC";
			break;
		 case 4:
			 sql=sql+"ORDER by registrationDate DESC";
			 break;
		 }
	
	
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

			switch (tk) {
			case 1:
				ps.setString(1, "%"+searchName+"%");
				break;
			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemSearchDTO dto=new ItemSearchDTO();
				dto.itemName(rs.getString("itemName"));
				dto.itemName(rsgetString
				dto.price(rs.getFloat("price"));
				dto.setregistrationDate(rs.getString("registrationDate"));
				itemList.add(dto);
			}
		} catch (Exception e){
			e.printStackTrace();
		}

		return itemList;
	}

}

