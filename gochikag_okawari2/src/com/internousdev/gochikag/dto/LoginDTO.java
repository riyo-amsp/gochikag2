package com.internousdev.gochikag.dto;

/**
 * LoginDTO ユーザー情報の値を格納するクラス
 * @author Ai Yoneshima
 * @since 3/10
 * @version 1.1
 */

public class LoginDTO {
/*
 * フィールド
 */
	/**
	 * パズワード
	 */
	private String password;
	/**
	 * メールアドレス
	 */
	private String phoneEmail;
	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * ログインフラグ
	 */
	private String loginFlg;
	/**
	 * ユーザーフラグ
	 */
	private String userFlg;
	/**
	 * ログインチェック用ディジェット
	 */
	private int count;

/*
 * メソッド
 */
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
	public int getUserId() {
	    return userId;
	}
	/**
	 * userIdを設定します。
	 * @param userId userId
	 */
	public void setUserId(int userId) {
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
	 * phoneEmailを取得します。
	 * @return phoneEmail
	 */
	public String getPhoneEmail() {
		return phoneEmail;
	}
	/**
	 * phoneEmailを設定します。
	 * @param phoneEmail phoneEmail
	 */
	public void setPhoneEmail(String phoneEmail) {
		this.phoneEmail = phoneEmail;
	}

	/**
	 * countを取得します。
	 * @return count
	 */
	public int getCount() {
	    return count;
	}
	/**
	 * countを設定します。
	 * @param count count
	 */
	public void setCount(int count) {
	    this.count = count;
	}
}
