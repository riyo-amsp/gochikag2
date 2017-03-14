/**
 *
 */
package action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.PayCheckDAO;
import dao.PayDAO;
import dto.PayDTO;

/**
 * @author internousdev
 *
 */
public class PayAction extends ActionSupport{

	private String nameE;
	private String userId;
	private String creditNumber;
	private String cardBrand;
	private String securityCode;
	private String expirationDate;

	public String execute() throws SQLException{
		String ret = ERROR;
		PayDAO dao = new PayDAO();
		PayCheckDAO dao2 = new PayCheckDAO();
		List<PayDTO> dto = new ArrayList<PayDTO>();
		List<PayDTO> dto2 = new ArrayList<PayDTO>();

		dto = dao.select(nameE,creditNumber,securityCode,cardBrand);
		System.out.println("1"+dto);

		dto2 = dao2.select(nameE,creditNumber,securityCode,cardBrand);
		System.out.println("2"+dto2);

		if(dto==dto2){

		System.out.println("Action");
		System.out.println(nameE);
		System.out.println(userId);
		System.out.println(creditNumber);
		System.out.println(cardBrand);
		System.out.println(securityCode);

		ret = SUCCESS;

		}
		return ret;
	}

	/**
	 * nameEを取得します。
	 * @return nameE
	 */
	public String getNameE() {
	    return nameE;
	}

	/**
	 * nameEを設定します。
	 * @param nameE nameE
	 */
	public void setNameE(String nameE) {
	    this.nameE = nameE;
	}

	/**
	 * userIdを取得します。
	 * @return userId
	 */
	public String getUserId() {
	    return userId;
	}

	/**
	 * userIdを設定します。
	 * @param userId userId
	 */
	public void setUserId(String userId) {
	    this.userId = userId;
	}

	/**
	 * creditNumberを取得します。
	 * @return creditNumber
	 */
	public String getCreditNumber() {
	    return creditNumber;
	}

	/**
	 * creditNumberを設定します。
	 * @param creditNumber creditNumber
	 */
	public void setCreditNumber(String creditNumber) {
	    this.creditNumber = creditNumber;
	}

	/**
	 * cardBrandを取得します。
	 * @return cardBrand
	 */
	public String getCardBrand() {
	    return cardBrand;
	}

	/**
	 * cardBrandを設定します。
	 * @param cardBrand cardBrand
	 */
	public void setCardBrand(String cardBrand) {
	    this.cardBrand = cardBrand;
	}

	/**
	 * securityCodeを取得します。
	 * @return securityCode
	 */
	public String getSecurityCode() {
	    return this.securityCode;
	}

	/**
	 * securityCodeを設定します。
	 * @param securityCode securityCode
	 */
	public void setSecurityCode(String securityCode) {
	    this.securityCode = securityCode;
	}

	/**
	 * expirationDateを取得します。
	 * @return expirationDate
	 */
	public String getExpirationDate() {
	    return expirationDate;
	}

	/**
	 * expirationDateを設定します。
	 * @param expirationDate expirationDate
	 */
	public void setExpirationDate(String expirationDate) {
	    this.expirationDate = expirationDate;
	}

}
