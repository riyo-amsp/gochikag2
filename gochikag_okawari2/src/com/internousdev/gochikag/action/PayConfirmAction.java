package com.internousdev.gochikag.action;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.PayConfirmDAO;
import com.internousdev.gochikag.dto.PayConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 全ての購入手続きを完遂し、gochikagDBと使用されたクレジット会社のDBそれぞれにクレジットの領収書を発行するアクション
 * @author KONASAKA TOMOHIRO
 * @since 2017/03/11
 * @version 1.1
 */
public class PayConfirmAction extends ActionSupport implements SessionAware {
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -3757587271926474250L;
	/**
	 * ログインID
	 */
	private String loginId;
	/**
	 * 名義
	 */
	private String nameE;
	/**
	 * 苗字
	 */
	private String lastName;
	/**
	 * 名前
	 */
	private String firstName;
	/**
	 * カードブランド
	 */
	private String cardBrand;
	/**
	 * 上６桁の数字
	 */
	private String firstSixDigits;
	/**
	 * 合計金額
	 */
	private int totalPrice;
	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 実行メソッド 全ての購入手続きを完遂し、gochikagDBと使用されたクレジット会社のDBそれぞれにクレジットの領収書を発行する
	 * @author KONASAKA TOMOHIRO
	 * @return result
	 */
	public String execute() throws SQLException{
		String ret = SUCCESS;
		int userId = 0;
		if(session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String now = sdf.format(cal.getTime());
		PayConfirmDAO dao = new PayConfirmDAO();

		if(!dao.updateConfirmFlg(userId)) ret = ERROR;

		List<PayConfirmDTO> dtoList = dao.selectCartData(userId);

		if(!dao.insertIntoCredit(userId, cardBrand, nameE, loginId, firstSixDigits, totalPrice, now)) 
			ret = ERROR;

		if(!dao.insertIntoUserHistroy(cardBrand, loginId, now, totalPrice, nameE, lastName, firstName)) 
			ret = ERROR;

		if(!dtoList.isEmpty()){
			for(PayConfirmDTO dto : dtoList){
				if(!dao.insertIntoPurchase(dto.getItemId(), userId, dto.getItemCount(), dto.getAmount(), now)){
					ret = ERROR;
				}
				if(!dao.updateItemStock(dto.getItemId(), dto.getItemCount())){
					ret = ERROR;
				}
				if(!dao.deleteCartData(dto.getItemId(), userId)){
					ret = ERROR;
				}
			}
		}
		return ret;
	}


	/**
	 * ログインIDを取得します。
	 * @return ログインID
	 */
	public String getLoginId() {
		return loginId;
	}
	/**
	 * ログインIDを設定します。
	 * @param loginId ログインID
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * 名義を取得します。
	 * @return 名義
	 */
	public String getNameE() {
		return nameE;
	}
	/**
	 * 名義を設定します。
	 * @param nameE 名義
	 */
	public void setNameE(String nameE) {
		this.nameE = nameE;
	}

	/**
	 * 苗字を取得します。
	 * @return 苗字
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * 苗字を設定します。
	 * @param lastName 苗字
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 名前を取得します。
	 * @return 名前
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * 名前を設定します。
	 * @param firstName 名前
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * カードブランドを取得します。
	 * @return カードブランド
	 */
	public String getCardBrand() {
		return cardBrand;
	}
	/**
	 * カードブランドを設定します。
	 * @param cardBrand カードブランド
	 */
	public void setCardBrand(String cardBrand) {
		this.cardBrand = cardBrand;
	}

	/**
	 * 上６桁の数字を取得します。
	 * @return 上６桁の数字
	 */
	public String getFirstSixDigits() {
		return firstSixDigits;
	}
	/**
	 * 上６桁の数字を設定します。
	 * @param firstSixDigits 上６桁の数字
	 */
	public void setFirstSixDigits(String firstSixDigits) {
		this.firstSixDigits = firstSixDigits;
	}

	/**
	 * 合計金額を取得します。
	 * @return 合計金額
	 */
	public int getTotalPrice() {
		return totalPrice;
	}
	/**
	 * 合計金額を設定します。
	 * @param totalPrice 合計金額
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * セッションを取得します。
	 * @return セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * セッションを設定します。
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
