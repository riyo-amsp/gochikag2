package com.internousdev.gochikag.action;

import java.sql.SQLException;
import java.util.*;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.PayDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート内商品を支払い画面に反映させる為のアクション
 * @author Riyo Takahashi
 * @since 2017/03/21
 * @version 1.1
 */
public class PayAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4465789826305102126L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * クレジットカードの有効年数リスト
	 */
	private List<String> years; 
	
	/**
	 * 実行メソッド
	 * ユーザーのカートフラグをtrueにするメソッド
	 * @author Riyo Takahashi
	 * @return ret 
	 * @throws SQLException 
	 */
	public String execute() throws SQLException{
		int userId = 0;
		String ret = ERROR;
		PayDAO dao = new PayDAO();
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		years = new ArrayList<String>();
		for(int i = 0; i <= 4; i++){
			years.add(Integer.toString(year));
			year++;
		}
		if(session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		/*
		 * ユーザーのログインが確認できないため、強制的にログアウトを行う。 
		 */
		if(userId == 0) return ret;
		
		/*
		 * 更新できているのかの真偽値を受け取り、真なら成功を戻り値に設定する。
		 */
		boolean updateFlg = dao.update(userId);
		if(updateFlg) ret = SUCCESS;
		return ret;
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
	/**
	 * クレジットカードの有効年数リストを取得します
	 * @return　years クレジットカードの有効年数リスト
	 */
	public List<String> getYears() {
		return years;
	}
}
