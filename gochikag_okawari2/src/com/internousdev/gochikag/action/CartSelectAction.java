package com.internousdev.gochikag.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.CartSelectDAO;
import com.internousdev.gochikag.dto.CartSelectDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * CartSelectAction カート情報を取得するアクション
 * @author MIYAGI KAZUNE
 * @since 2017/03/21
 * @version 1.1
 */
public class CartSelectAction extends ActionSupport implements SessionAware{
	
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 3755125052483344123L;
	/**
	 * 商品ID
	 */
	private int userId;
	/**
	 * 各商品情報が格納されたリスト
	 */
	private List<CartSelectDTO> itemList;
	/**
	 * ストック数の一時保管リスト
	 */
	private ArrayList<Integer> tempStockList;
	/**
	 * 各商品のストック数が入ったリスト
	 */
	private List<ArrayList<Integer>> itemStockList;
	/**
	 * セッション
	 */
	private Map<String,Object> session;
	/**
	 * 合計金額
	 */
	private int totalPrice;

	/**
	 * 実行メソッド
	 * お客様のカートに入っている情報を取得するメソッド
	 * @author MIYAGI KAZUNE
	 * @return ret 空も含めて、カート情報が取得できればSUCCESS、できなかったまたはユーザーIDが取得できなかった場合はERROR
	 */
	public String execute() throws SQLException{
		String ret = ERROR;
		userId = 0;
		if(session.containsKey("userId")){
			userId = (int) session.get("userId");
		}
		/*
		 * ユーザーのログインが確認できないため、強制的にログアウトを行う。 
		 */
		if(userId == 0) return ret;
		
		CartSelectDAO dao=new CartSelectDAO();
		itemList = new ArrayList<CartSelectDTO>();
		itemList = dao.select(userId);
		itemStockList = new ArrayList<ArrayList<Integer>>();
		totalPrice = 0;
		/*
		 * 合計金額の取得
		 */
		for(CartSelectDTO item : itemList){
			totalPrice += item.getAmount();
			tempStockList = new ArrayList<Integer>();
			/*
			 * 各アイテムのストック数でリストを一時的に生成し、各々の値をさらにリストに格納する
			 */
			for(int i = 1; i <= item.getStockCount(); i++){
				tempStockList.add(i);
			}
			itemStockList.add(tempStockList);
		}
		ret = SUCCESS;
		return ret;
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

	/**
	 * itemListを取得します。
	 * @return itemList
	 */
	public List<CartSelectDTO> getItemList() {
		return itemList;
	}
	/**
	 * itemListを設定します。
	 * @param itemList itemList
	 */
	public void setItemList(List<CartSelectDTO> itemList) {
		this.itemList = itemList;
	}

	/**
	 * totalPriceを取得します。
	 * @return totalPrice
	 */
	public int getTotalPrice() {
		return totalPrice;
	}
	/**
	 * totalPriceを設定します。
	 * @param totalPrice totalPrice
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * itemStockListを取得します。
	 * @return itemStockList
	 */
	public List<ArrayList<Integer>> getItemStockList() {
		return itemStockList;
	}
	/**
	 * itemStockListを設定します。
	 * @param itemStockList itemStockList
	 */
	public void setItemStockList(List<ArrayList<Integer>> itemStockList) {
		this.itemStockList = itemStockList;
	}
}
