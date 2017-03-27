package com.internousdev.gochikag.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.internousdev.gochikag.dao.MyPageDAO;
import com.internousdev.gochikag.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;


/**
 * マイページにてお客様情報の確認する為のアクション
 * @author Tomohiro Konasaka
 * @since 2017/03/21
 * @version 1.1
 */
public class MyPageAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -1890358390695521522L;
	/**
	 * お客様情報リスト
	 */
	private List<MyPageDTO> myInfo;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	
	/** 
	 * 実行メソッド
	 * ログインユーザーの購入履歴を取得するメソッド
	 * @author Tomohiro Konasaka
	 * @return ret ユーザーのログインが確認できなかった場合はERROR、それ以外はSUCCESSを返す
	 * @throws NumberFormatException
	 * @throws SQLException 
	 */
	public String execute() throws NumberFormatException, SQLException{
		MyPageDAO dao = new MyPageDAO();
		int userId = 0;
		if(session.containsKey("userId")){
			userId = (int) session.get("userId");
		}
		/*
		 * ユーザーのログインが確認できないため、強制的にログアウトを行う。 
		 */
		if(userId == 0) return ERROR;
		myInfo = dao.select(userId);	
		return SUCCESS;
	}

	/**
	 * お客様情報リストを取得します。
	 * @return お客様情報リスト
	 */
	public List<MyPageDTO> getMyInfo() {
		return myInfo;
	}
	/**
	 * お客様情報リストを設定します。
	 * @param myInfo お客様情報リスト
	 */
	public void setMyInfo(List<MyPageDTO> myInfo) {
		this.myInfo = myInfo;
	}

	/**
	 * セッションの値を取得します。
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * セッションの値を設定します。
	 * @return session 
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}	
}