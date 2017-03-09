/**
 *
 */
package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

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

	public String execute(){
		String ret = ERROR;
		PayDAO dao = new PayDAO();
		PayDTO dto = new PayDTO();

		System.out.println("Action");
		System.out.println(nameE);
		System.out.println(userId);
		System.out.println(creditNumber);
		System.out.println(cardBrand);
		System.out.println(securityCode);

		ArrayList<PayDTO> arrayDto = new ArrayList<PayDTO>();
		arrayDto = dao.select(securityCode,creditNumber,cardBrand,nameE);
		//if((userId==dto.getUserId())&&(securityCode==dto.getSecurityCode())&&(creditNumber==dto.getCreditNumber())){
		ret = SUCCESS;
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
	    return securityCode;
	}

	/**
	 * securityCodeを設定します。
	 * @param securityCode securityCode
	 */
	public void setSecurityCode(String securityCode) {
	    this.securityCode = securityCode;
	}

}
