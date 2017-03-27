package com.internousdev.gochikag.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.gochikag.util.DBConnector;



/**
 * カートの情報を更新するクラス
 * @author Kazune Miyagi
 * @since 2017/03/15
 * @version 1.1
 */
public class CartInsertDAO {
	/**
	 * カートの情報を更新するメソッド
	 * @param userId 顧客ID
	 * @param itemId 商品ID
	 * @param itemCount 商品数
	 * @param amount 合計
	 * @return 更新した行数
	 * @throws SQLException
	 */
	public boolean insert(int userId, int itemId,int itemCount,int amount)throws SQLException{
		DBConnector db = new DBConnector("gochikag");
		Connection con = db.getConnection();
		PreparedStatement ps = null;
		String sql = "insert into cart2 (user_id, item_id, item_count, amount) values(?, ?, ?, ?)";
		int rs = 0;
		boolean insertFlg = false;
		
		try{
			ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2,itemId);
			ps.setInt(3, itemCount);
			ps.setInt(4, amount);
			con.setAutoCommit(false);
			rs = ps.executeUpdate();
			con.commit();
		}
		catch(SQLException e1){
			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			e1.printStackTrace();
		}
		try{
			if(ps != null) ps.close();
			if(con != null) con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(rs != 0) insertFlg = true;
		return insertFlg;
	}

	/**
	 * 商品IDを呼んでくるメソッド
	 * @param userId 顧客ID
	 * @param itemId 商品ID
	 * @return itemIdList
	 */
	public List<Integer> select(int userId){
		DBConnector db = new DBConnector("gochikag");
		Connection con = db.getConnection();
		PreparedStatement ps=null;
		String sql = "select item_id from cart2 where user_id = ?";
		List<Integer> itemIdList = new ArrayList<Integer>();
		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,userId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				itemIdList.add(rs.getInt("item_id"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return itemIdList;
	}
}
