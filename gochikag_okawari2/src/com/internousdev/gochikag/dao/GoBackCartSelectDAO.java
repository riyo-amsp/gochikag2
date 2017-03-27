package com.internousdev.gochikag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.gochikag.util.DBConnector;
/**
 * クレジット認証及びカート認証を解除するクラス
 * @author Tomoya Ikarashi
 * @since 2017/03/17
 * @version 1.1
 */
public class GoBackCartSelectDAO {

	/**
	 * credit_flgとcart_flgをfalseにするメソッド
	 * @param userId 顧客情報
	 * @return chechFlg 解除できたらfalse
	 * @throws SQLException エラー処理
	 */
	public boolean update(int userId) throws SQLException{
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","gochikag","root","mysql");
		Connection con = db.getConnection();
		PreparedStatement ps = null;
		String sql = "update cart2 set credit_flg = false and cart_flg = false where user_id = ?";
		int rs = 0;
		boolean checkFlag = false;

		try{
			ps = con.prepareStatement(sql);
			System.out.println(ps);
			ps.setInt(1, userId);
			System.out.println(ps);
			con.setAutoCommit(false);
			rs = ps.executeUpdate();
			if(rs != 0){
				checkFlag = true;
			}
			con.commit();
		}catch(SQLException e){
			con.rollback();
			e.printStackTrace();
		}finally{
			if(ps != null) ps.close();
			if(con != null) con.close();
		}
		return checkFlag;
	}
}
