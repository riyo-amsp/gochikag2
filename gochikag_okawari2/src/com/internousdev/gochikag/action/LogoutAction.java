package com.internousdev.gochikag.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.LogoutDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログアウトする為のアクション
 * @author Juna Watanabe
 * @since 2017/03/21
 * @version 1.1
 *
 */

public class LogoutAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5523692462762364548L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	
	
	/**
	 * 実行メソッド
	 * ユーザーの意思によるログアウト、もしくは予期せぬエラーが発生したための強制的なログアウト
	 * @author Juna Watanabe
	 * @return ret 予期せぬエラーが発生した場合やユーザー認証が取れない場合はERROR、それ以外の場合はSUCCESSを返す
	 * @throws
	 */
	public String execute()throws SQLException{

		String ret = ERROR;
		LogoutDAO dao = new LogoutDAO();
		int userId = 0;
		if(session.containsKey("userId")){
			userId = (int) session.get("userId");
		}else{
			((SessionMap<String, Object>)session).invalidate();
			return ret;
		}

		/*
		 * sessionを破棄する 
		 */
		if(dao.updateGochikagLoginFlg(userId) && dao.updateOCLoginFlg(userId)){
			((SessionMap<String, Object>)session).invalidate();
			ret = SUCCESS;
		}
		return ret;
	}

	/**
	 * sessionを取得します。
	 * @return session
	 */
	public Map<String, Object> getSession(){
		return session;
	}
	/**
	 * sessionを設定します。
	 * @param session session
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>)session;

	}
}
