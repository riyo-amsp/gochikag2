/**
 *
 */
package dto;

/**
 * @author internousdev
 *
 */
public class PayDTO {

	private String nameE;
	private String userId;
	private String creditNumber;
	private String cardBrand;
	private String securityCode;

	public String getName_e() {
		return this.nameE;
	}
	public void setNameE(String nameE) {
		this.nameE = nameE;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCreditNumber() {
		return this.creditNumber;
	}
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}
	public String getCardBrand() {
		return this.cardBrand;
	}
	public void setCardBrand(String cardBrand) {
		this.cardBrand = cardBrand;
	}
	public String getSecurityCode() {
		return this.securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
}
