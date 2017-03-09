/**
*
*/
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.PayDTO;
import util.DBConnector;

/**
* @author internousdev
*
*/
public class PayDAO {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	PayDTO dto = new PayDTO();
	ArrayList<PayDTO> dtoList = new ArrayList<PayDTO>();

	public ArrayList<PayDTO> select(String securityCode,String creditNumber, String cardBrand, String nameE){
		String sql = "select * from credit2 where name_e = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,securityCode);
			ps.setString(2,creditNumber);
			ps.setString(3,cardBrand);
			ps.setString(4,nameE);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dto = new PayDTO();
				dto.setSecurityCode(rs.getString("security_code"));
				dto.setCardBrand(rs.getString("card_brand"));
				dto.setNameE(rs.getString("name_e"));
				dto.setCreditNumber(rs.getString("credit_number"));
				dtoList.add(dto);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	return dtoList;
	}


}
