package com.internousdev.gochikag.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.GoBackCartSelectDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * クレジット認証およびカートフラグを解除するアクション
 * @author Yoshikazu Sakamoto
 * @since 2017/03/17
 * @version 1.1
 */
public class GoBackCartSelectAction extends ActionSupport implements SessionAware{
	
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 431450842427947532L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 実行メソッド
	 * クレジット認証およびカートフラグを解除するメソッド
	 * @author Yoshikazu Sakamoto
	 * @return ret もしユーザーのログインが確認できない場合はまたクレジット及びカート情報の更新に失敗した場合はERROR、成功した場合はSUCCESSを返す
	 * @throws SQLException エラー処理
	 */
	public String execute() throws SQLException{
		String ret = ERROR;
		int userId = 0;
		GoBackCartSelectDAO dao = new GoBackCartSelectDAO();
		
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
	 * sessionを取得します。
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * sessionを設定します。
	 * @param session session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
