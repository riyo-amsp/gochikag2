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
 * @author internous
 *
 */
public class PayCheckDAO {

		//openconnectからクレジットカード番号・セキュリティコード・カード会社・名前を取得
		public List<PayDTO> select(String nameE, String creditNumber, String securityCode, String cardBrand)throws SQLException{
		DBConnector db = new DBConnector();

		Connection con = db.getConnection();

		PreparedStatement ps= null;
		PayDTO dto = new PayDTO();
		List<PayDTO> checkList = new ArrayList<PayDTO>();
		String sql = null;

			sql = "select name_e, credit_number, security_code, card_brand from credit_card where security_code = ? ";

			System.out.println("check"+sql);
		try{
			ps = con.prepareStatement(sql);

			System.out.println(ps);

			ps.setString(1,nameE);
			ps.setString(2,creditNumber);
			ps.setString(3,securityCode);
			ps.setString(4,cardBrand);

			System.out.println(ps);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				dto.setSecurityCode(rs.getString("name_e"));
				dto.setCreditNumber(rs.getString("credit_number"));
				dto.setCardBrand(rs.getString("security_code"));
				dto.setNameE(rs.getString("card_brand"));
				System.out.println(dto);

				checkList.add(dto);

				System.out.println("dao"+checkList);




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
	return checkList;
	}
}

