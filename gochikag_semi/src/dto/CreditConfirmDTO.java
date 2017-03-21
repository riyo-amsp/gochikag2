package dto;

public class CreditConfirmDTO {
	private String loginId;
	private String nameE; //last_name + first_name
	private int securityCode;
	private String expirationDay;
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getNameE() {
		return nameE;
	}
	public void setNameE(String nameE) {
		this.nameE = nameE;
	}
	public int getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
	public String getExpirationDay() {
		return expirationDay;
	}
	public void setExpirationDay(String expirationDay) {
		this.expirationDay = expirationDay;
	}
	

}
