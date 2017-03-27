package com.internousdev.gochikag.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.GoBackCreditConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * クレジット認証を解除するアクション
 * @author Ai Yoneshima
 * @since 2017/03/10
 * @version 1.1
 */
public class GoBackCreditConfirmAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 5761050233808709751L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 実行メソッド
	 * クレジット認証を解除する実行メソッド
	 * @author Ai Yoneshima
	 * @return ret もしユーザーのログインが確認できない場合はまたクレジット情報の更新に失敗した場合はERROR、成功した場合はSUCCESSを返す
	 */
	public String execute(){
		String ret = ERROR;
		int userId = 0;
		GoBackCreditConfirmDAO dao = new GoBackCreditConfirmDAO();
		if(session.containsKey("userId")){
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
}
