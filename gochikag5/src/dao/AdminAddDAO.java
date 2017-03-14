package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.AdminAddDTO;
import util.DBConnector;

public class AdminAddDAO {


	public int itemInsert1(String itemName, float price, int itemCount, String mainPicture, String category)
	{
	    System.out.println("registrationDate");
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int rs = 0;
		String sql1 = "insert into item(item_name,price,item_count,main_picture,category)values(?,?,?,?,?)";

		try {
			System.out.println("sql1");
			PreparedStatement ps1 = con.prepareStatement(sql1);
			//System.out.println("sql"+ps);
			ps1.setString(1, itemName);
			ps1.setFloat(2, price);
			ps1.setInt(3, itemCount);
			ps1.setString(4, mainPicture);
			ps1.setString(5, category);
			System.out.println("category" + category);
			rs = ps1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
     return rs;
	}


	 public int select(){
	   DBConnector db = new DBConnector();
	   Connection con = db.getConnection();
	   String sql = "select max(item_id) from item";
	   AdminAddDTO dto = new AdminAddDTO();
       int id = 0;
	   try{
		  PreparedStatement ps = con.prepareStatement(sql);
		  ResultSet rs = ps.executeQuery();

		  if(rs.next()){
			 id = rs.getInt("max(item_id)");
		  }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("SELECTだよ");
		System.out.println(id);

	return id;
	 }



	public int itemInsert2(int itemId, String pictures)
	{
	    System.out.println("registrationDate");
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int rs = 0;
		String sql2 = "insert into pictures(item_id, pictures) values (?,?)";


		try {
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setInt(1,  itemId);
			ps2.setString(2, pictures);
			rs = ps2.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
     return rs;
	}

	public int itemInsert3(int itemId, String detailJa, String detailEn)
	{
	    System.out.println("registrationDate");
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int rs = 0;

		String sql3 = "insert into detail(item_id, detail_ja, detail_en) values (?,?,?)";

		try {
			PreparedStatement ps3 = con.prepareStatement(sql3);
			ps3.setInt(1, itemId);
			ps3.setString(2, detailJa);
			ps3.setString(3, detailEn);
			rs = ps3.executeUpdate();
			System.out .println("INSERT3だよ");
			System.out .println(itemId);
			System.out .println(detailJa);


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
     return rs;
	}


}

