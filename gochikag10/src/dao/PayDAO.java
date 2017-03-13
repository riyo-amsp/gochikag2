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

	public List<PayDTO> select(String creditNumber, String securityCode, String cardBrand, String nameE)throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		PreparedStatement ps= null;
		PayDTO dto = new PayDTO();

		List<PayDTO> dtoList = new ArrayList<PayDTO>();

		String sql = "select * from credit2 where credit_number = ? "
				+ "and security_code = ? "
				+ "and card_brand = ? "
				+ "and name_e = ? ";

		try{
			ps = con.prepareStatement(sql);

			ps.setString(1,securityCode);
			ps.setString(2,creditNumber);
			ps.setString(3,cardBrand);
			ps.setString(4,nameE);

			System.out.println(ps);

			ResultSet rs = ps.executeQuery();

			System.out.println(rs);

			while(rs.next()){

				dto.setSecurityCode(rs.getString("security_code"));
				dto.setCreditNumber(rs.getString("credit_number"));
				dto.setCardBrand(rs.getString("card_brand"));
				dto.setNameE(rs.getString("name_e"));
				System.out.println(dto);

				dtoList.add(dto);

				System.out.println("dao2");
				System.out.println(dtoList);
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
