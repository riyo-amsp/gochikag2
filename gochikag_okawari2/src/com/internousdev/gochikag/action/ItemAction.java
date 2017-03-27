package com.internousdev.gochikag.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.ItemDAO;
import com.internousdev.gochikag.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 各商品の詳細を表示する為のアクション
 * @author Yoshikazu Sakamoto
 * @since 2017/03/21
 * @version 1.1
 */
public class ItemAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -2437234503504000416L;
	/**
	 * 商品ID
	 */
	private String itemId;
	/**
	 * itemDTO
	 */
	private ItemDTO dto;
	/**
	 * 在庫数
	 */
	private int stockNumber;
	/**
	 * 価格
	 */
	private int price;
	/**
	 * 在庫数をリストに格納
	 */
	private List<Integer> stockNumberList;
	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 実行メソッド 
	 * 商品詳細ページに遷移するメソッド
	 * @author Yoshikazu Sakamoto
	 * @return ret もし在庫数がちゃんと存在する場合はSUCCESS、それ以外の場合はユーザーがログイン時はerror1、ログインをしていないときはerror2を返す
	 */
	public String execute() {
		String ret = SUCCESS;
		int userId = 0;
		if(session.containsKey("userId")){
			userId = (int) session.get("userId");
		}
		ItemDAO dao = new ItemDAO();
		dto = dao.select(Integer.parseInt(itemId));
		stockNumber = dto.getStockNumber();
		price = (int) dto.getPrice();
		stockNumberList = new ArrayList<Integer>();
		
		/*
		 * アイテム情報がDTOに格納されているかを確かめる
		 */
		if(!dto.isItemFlg()){
			if(userId == 0) ret = "error1";
			else ret = "error2";
		}
		
		/*
		 * 選ばれた商品の在庫数が他のユーザーが丁度購入したことによって0になってい商品詳細ページへ遷移できなくなってしまった場合
		 * もしユーザーがログインしてたらmainページへ遷移、そうでない場合はtopページへ遷移
		 */
		if(dto.getStockNumber() == 0){
			if(userId == 0) ret = "error1";
			else ret = "error2";
		}else{
			for(int i = 1; i <= stockNumber; i++){
				stockNumberList.add(i);
			}
		}
		return ret;
	}

	/**
	 * 商品IDを取得します。
	 * @return 商品ID
	 */
	public String getItemId() {
		return itemId;
	}
	/**
	 * 商品IDを設定します。
	 * @param itemId 商品ID
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * itemDTOを取得します。
	 * @return itemDTO
	 */
	public ItemDTO getDto() {
		return dto;
	}
	/**
	 * 価格を取得します。
	 * @return 価格
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 在庫数を取得します。
	 * @return 在庫数
	 */
	public int getStockNumber() {
		return stockNumber;
	}
	/**
	 * 在庫数をリストに格納を取得します。
	 * @return 在庫数をリストに格納
	 */
	public List<Integer> getStockNumberList() {
		return stockNumberList;
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