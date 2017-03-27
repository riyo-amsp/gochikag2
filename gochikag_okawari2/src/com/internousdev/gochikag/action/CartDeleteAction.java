package com.internousdev.gochikag.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.CartDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * CartDeleteAction カート情報を削除するアクション
 * @author Kayo Ueki
 * @since 2017/03/21
 */

public class CartDeleteAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 6409207279119634229L;
	/**
	 * 商品ID
	 */
	private String itemId;
	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * セッション
	 */
	private Map<String,Object> session;

	/**
	 * 実行メソッド
	 * カート情報を削除するメッソド
	 * @author Kayo Ueki
	 * @return ret カート情報を削除できればSUCCESS、できなかったまたはユーザーIDが取得できなかった場合はERROR
	 * @throws SQLException エラー処理
	 */
	public String execute() throws SQLException{
		String ret = ERROR;
		userId=0;
		if(session.containsKey("userId")){
			userId = (int) session.get("userId");
		}
		if(userId == 0){
			/*
			 * ユーザーのログインが確認できないため、強制的にログアウトを行う。 
			 */
			return ret;
		}else{
			CartDeleteDAO dao = new CartDeleteDAO();
			/*
			 * 削除できているのかの真偽値を受け取り、真なら成功を戻り値に設定する。
			 */
			boolean deleteFlg = dao.delete(Integer.parseInt(itemId),userId);
			if(deleteFlg) ret = SUCCESS;
		}
		return ret;
	}

	/**
	 * itemIdを取得します。
	 * @return itemId
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * itemIdを設定します。
	 * @param itemId itemId
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
