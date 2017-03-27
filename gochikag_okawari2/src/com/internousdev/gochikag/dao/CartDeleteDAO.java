package com.internousdev.gochikag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.gochikag.util.DBConnector;
/**
 * カートtableのデータを削除するクラス
 * @author Riyo Takahashi
 * @since 2017/03/15
 * @version 1.1
 *
 */
public class CartDeleteDAO {

	/**
	 * カートtableのデータを削除するメソッド
	 * @param itemId 商品ID
	 * @param userId 顧客ID
	 * @return 削除した行数
	 * @throws SQLException
	 */
	public boolean delete(int itemId,int userId) throws SQLException{

		//フィールド
		DBConnector db=new DBConnector("gochikag");
		Connection con=db.getConnection();
		PreparedStatement ps = null;
		int rs = 0;
		boolean deleteFlg = false;
		String sql="delete from cart2 where user_id=? and item_id=?";

		try{
			ps=con.prepareStatement(sql);
			ps.setInt(1,userId);
			ps.setInt(2,itemId);
			con.setAutoCommit(false);
			rs = ps.executeUpdate();
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