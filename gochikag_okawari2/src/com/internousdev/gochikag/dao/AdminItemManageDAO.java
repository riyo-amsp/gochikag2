package com.internousdev.gochikag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.gochikag.dto.ItemDTO;
import com.internousdev.gochikag.util.DBConnector;

/**
* @author Yoshikazu Sakamoto
* @since 2017/03/13
* @version 1.1
*/
public class AdminItemManageDAO {

	/**
	 * カテゴリーに該当する商品を返すメソッド
	 * @param category
	 * @return nameList
	 */

	public ArrayList<String> select1(String category) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","gochikag","root","mysql");
		Connection con = db.getConnection();
		ArrayList<String> nameList = new ArrayList<String>();

		String sql = "select item_name from item where category = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,category);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				nameList.add(rs.getString("item_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nameList;
	}

	/**
	 * 商品名に紐付いた商品情報を取得するメソッド
	 * @param itemName
	 * @return dto
	 */
	public ItemDTO select2(String itemName) throws SQLException{
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","gochikag","root","mysql");
		Connection con = db.getConnection();
		ItemDTO dto = new ItemDTO();
		PreparedStatement ps = null;
		String sql = "select item_name,item_id,price,stock_number from item where item_name = ? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, itemName);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setPrice(rs.getInt("price"));
				dto.setStockNumber(rs.getInt("stock_number"));
				dto.setItemFlg(true);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(ps != null) ps.close();
			if(con != null) con.close();
		}
		return dto;
	}

	/**
	 * 商品の在庫数を更新するメソッド
	 * @param itemId
	 * @param stockNumber
	 * @return rs
	 */
	public int update(int itemId, int stockNumber) throws SQLException{
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","gochikag","root","mysql");
		Connection con=db.getConnection();
		PreparedStatement ps = null;
		int rs=0;
		String sql="update item set stock_number = ? where item_id = ?";
		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,stockNumber);
			ps.setInt(2, itemId);
			con.setAutoCommit(false);
			rs=ps.executeUpdate();
			con.commit();
		}catch(SQLException e){
			con.rollback();
			e.printStackTrace();
		} finally{
			if(ps != null) ps.close();
			if(con != null) con.close();
		}
		return rs;
	}

	/**
	 * 商品の詳細情報を削除する
	 * @param itemId
	 * @return deleteFlg 削除できたかどうかの真偽値
	 */
	public boolean deleteFromDetail(int itemId) throws SQLException{
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","gochikag","root","mysql");
		Connection con = db.getConnection();
		PreparedStatement ps = null;
		int rs = 0;
		boolean deleteFlg = false;
		String sql="delete from detail where item_id = ?";

		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,itemId);
			con.setAutoCommit(false);
			rs=ps.executeUpdate();
			con.commit();
		}catch(SQLException e){
			con.rollback();
			e.printStackTrace();
		}finally{
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}
		if(rs != 0) deleteFlg = true;
		return deleteFlg;
	}

	/**
	 * 商品の写真を削除する
	 * @param itemId
	 * @return deleteFlg 削除できたかどうかの真偽値
	 */
	public boolean deleteFromPictures(int itemId) throws SQLException{
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","gochikag","root","mysql");
		Connection con=db.getConnection();
		PreparedStatement ps = null;
		int rs = 0;
		boolean deleteFlg = false;
		String sql="delete from pictures where item_id=?";
		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,itemId);
			con.setAutoCommit(false);
			rs=ps.executeUpdate();
			con.commit();
		}catch(SQLException e){
			con.rollback();
			e.printStackTrace();
		}finally{
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}
		if(rs != 0) deleteFlg = true;
		return deleteFlg;
	}

	/**
	 * 商品の基本情報を削除する
	 * @param itemId
	 * @return deleteFlg 削除できたかどうかの真偽値
	 */
	public boolean deleteFromItem(int itemId) throws SQLException{
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","gochikag","root","mysql");
		Connection con=db.getConnection();
		PreparedStatement ps = null;
		int rs = 0;
		boolean deleteFlg = false;
		String sql="delete from item where item_id=?";

		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,itemId);
			con.setAutoCommit(false);
			rs=ps.executeUpdate();
			con.commit();
		}catch(SQLException e){
			con.rollback();
			e.printStackTrace();
		}finally{
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}
		if(rs != 0) deleteFlg = true;
		return deleteFlg;
	}

}
