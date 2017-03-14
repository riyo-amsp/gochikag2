/**
*
*/
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.PayDTO;
import util.DBConnector;

/**
* @author internousdev
*
*/
public class PayDAO {

	//gochikagDBからクレジットカード番号・セキュリティコード・カード会社・名義を取得
	public List<PayDTO> select(String nameE, String creditNumber, String securityCode, String cardBrand)throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		PayDTO dto = new PayDTO();
		List<PayDTO> dtoList = new ArrayList<PayDTO>();
		PreparedStatement ps = null;

		String sql = "select * from credit_card where name_e = ? "
				+ "and credit_number = ? "
				+ "and security_code = ? "
				+ "and card_brand = ?";

		try{
			ps = con.prepareStatement(sql);

			System.out.println(ps);

			ps.setString(1,nameE);
			ps.setString(2,creditNumber);
			ps.setString(3,securityCode);
			ps.setString(4,cardBrand);

			System.out.println("dao"+ps);

			ResultSet rs = ps.executeQuery();

			System.out.println("dao"+rs);

			while(rs.next()){

				dto.setSecurityCode(rs.getString("name_e"));
				dto.setCreditNumber(rs.getString("credit_number"));
				dto.setCardBrand(rs.getString("security_code"));
				dto.setNameE(rs.getString("card_brand"));
				System.out.println(dto);

				dtoList.add(dto);

				System.out.println("dao"+dtoList);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			 ps.close();
			 con.close();
		}
	return dtoList;
	}


}
