
package com.internousdev.gochikag.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.CartInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * CartInsertAction カートにアイテムを入れるアクション
 * @author UEKI KAYO
 * @since 2017/03/21
 * @version 1.1
 */
public class CartInsertAction extends ActionSupport implements SessionAware {
	
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8716175341246623363L;
	
	/**
	 * 商品ID
	 */
	private int itemId;
	/**
	 * 在庫数
	 */
	private int itemCount;
	/**
	 * 価格
	 */
	private int price;
	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 実行メソッド
	 * カートにアイテムを入れるメソッド
	 * @author UEKI KAYO
	 * @return ret お客様のカートにアイテムを入れることができたらSUCCESS、できなかったまたはユーザーIDが取得できなかった場合はERROR
	 * @throws SQLException 
	 */
	public String execute() throws SQLException {
		String ret = ERROR;
		int userId = 0;
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if(userId == 0){
			/*
			 * ユーザーのログインが確認できないため、ログインページへ遷移しログインを促す。 
			 */
			return ret;
		}
		int amount = itemCount * price;
		CartInsertDAO dao = new CartInsertDAO();
		List<Integer> itemIdList = dao.select(userId);
		for (Integer i : itemIdList) {
			/*
			 * ユーザーが同じitemIdの商品をカートに入れようとしている場合に防ぐための処理
			 * もし、同一の商品が選択された場合は後の処理を行わずにここで処理を終了する
			 */
			if (i == itemId){ 
				ret = SUCCESS;
				return ret;
			}
		}
		/*
		 * 値が挿入できているのかの真偽値を受け取り、真なら成功を戻り値に設定する。
		 */
		boolean insertFlg = dao.insert(userId, itemId, itemCount, amount);
		if(insertFlg) ret = SUCCESS;
		return ret;
	}

	/**
	 * 商品IDを取得します。
	 * @return itemId 商品ID
	 */
	public int getItemId() {
		return itemId;
	}
	/**
	 * 商品IDを設定します。
	 * @param itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * 在庫数を取得します。
	 * @return itemCount 在庫数
	 */
	public int getItemCount() {
		return itemCount;
	}
	/**
	 * 在庫数を設定します。
	 * @param itemCount
	 */
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	/**
	 * セッションを取得します。
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * セッションを設定します。
	 * @param session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 価格を取得します。
	 * @return price 価格
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * 価格を設定します。
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
}
