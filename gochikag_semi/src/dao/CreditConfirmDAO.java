package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dto.CreditConfirmDTO;

import util.DBConnector;

public class CreditConfirmDAO {	
	
	public boolean select1(String stringCardBrand, String creditNumber6){
		DBConnector db = new DBConnector("creditcard_manager");
		Connection con = db.getConnection();
		boolean checkNumberFlag = false;
		String sql = "SELECT card_number FROM m_creditcard_type WHERE card_name LIKE " + stringCardBrand;
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				if(rs.getString("card_number").equals(creditNumber6)){
					checkNumberFlag  = true;
				}
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return checkNumberFlag;
	}

	
	
	public CreditConfirmDTO select2(String cardBrand, String creditNumber){
		DBConnector db = new DBConnector(cardBrand);
		Connection con = db.getConnection();
		CreditConfirmDTO dto = new CreditConfirmDTO();
		String sql = null;
		if(cardBrand.equals("visa")){
			sql = "select login_id, first_name, last_name, security_code, expiration_day from credit_card where credit_number = ?";
		}else{
			sql = "select login_id, name_e, security_code, expiration_day from credit_card where credit_number = ?";
		}
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, creditNumber);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){				
				dto.setLoginId(rs.getString("login_id"));
				if(cardBrand.equals("visa")){
					dto.setNameE(rs.getString("last_name") + " " +rs.getString("first_name"));
				}else{
					dto.setNameE(rs.getString("name_e"));
				}
				dto.setSecurityCode(rs.getInt("security_code"));
				dto.setExpirationDay(rs.getString("expiration_day"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}
	
	public int select3(int userId){
		DBConnector db = new DBConnector("gochikag");
		Connection con = db.getConnection();
		PreparedStatement ps = null;
		String sql = "select sum(amount) from cart2 where user_id = ?";
		int totalPrice = 0;
		try{
			ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				totalPrice = rs.getInt("sum(amount)");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return totalPrice;
		
	}
	
	
	
	public boolean update(int userId) throws SQLException{
		Connection con = new DBConnector("gochikag").getConnection();
		PreparedStatement ps = null;
		int rs = 0;
		String sql = "update cart2 set credit_flg  = true where user_id = ?";
		boolean checkCartFlag = false;
		
		try{
			ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			con.setAutoCommit(false);
			rs = ps.executeUpdate();
			con.commit();
			if(rs != 0) checkCartFlag = true;
			
		}catch(SQLException e){
			con.rollback();
			e.printStackTrace();
		}finally{
			if(ps != null) ps.close();
			if(con != null) con.close();
		}
		return checkCartFlag;
	}
}
