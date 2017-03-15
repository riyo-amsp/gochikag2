package dto;

public class LoginDTO {
	//private String name;
	private String password;
	private String phoneEmail;
	private String userId;
	private String loginFlg;
	private String userFlg;
	/**
	 * nameを取得します。
	 * @return name
	 */
	/*public String getName() {
	    return name;
	}*/
	/**
	 * nameを設定します。
	 * @param name name
	 */
	/*public void setName(String name) {
	    this.name = name;
	}*/
	/**
	 * passwordを取得します。
	 * @return password
	 */
	public String getPassword() {
	    return password;
	}
	/**
	 * passwordを設定します。
	 * @param password password
	 */
	public void setPassword(String password) {
	    this.password = password;
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
	 * loginFlgを取得します。
	 * @return loginFlg
	 */
	public String getLoginFlg() {
	    return loginFlg;
	}
	/**
	 * loginFlgを設定します。
	 * @param loginFlg loginFlg
	 */
	public void setLoginFlg(String loginFlg) {
	    this.loginFlg = loginFlg;
	}
	/**
	 * userFlgを取得します。
	 * @return userFlg
	 */
	public String getUserFlg() {
	    return userFlg;
	}
	/**
	 * userFlgを設定します。
	 * @param userFlg userFlg
	 */
	public void setUserFlg(String userFlg) {
	    this.userFlg = userFlg;
	}
	/**
	 * @return phoneEmail
	 */
	public String getPhoneEmail() {
		return phoneEmail;
	}
	/**
	 * @param phoneEmail セットする phoneEmail
	 */
	public void setPhoneEmail(String phoneEmail) {
		this.phoneEmail = phoneEmail;
	}



}

