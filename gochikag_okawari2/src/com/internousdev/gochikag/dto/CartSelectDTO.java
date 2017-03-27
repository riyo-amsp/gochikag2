package com.internousdev.gochikag.dto;

/** 
 * CartSelectDTO カートの値を格納するクラス
 * @author Junna Watababe
 * @since 3/10
 * @version 1.1
 */

public class CartSelectDTO {
	
/*
 * フィールド	
 */
	/**
	 * 商品ID
	 */
	private int itemId;
	/**
	 * アイテムリストから値を取得するためのインデックス番号
	 */
	private int index;
	/**
	 * 商品名
	 */
	private String itemName;
	/**
	 * 商品価格
	 */
	private int price;
	/**
	 * 購入予定商品数
	 */
	private int itemCount;
	/**
	 * 各商品小計
	 */
	private int amount;
	/**
	 * 各商品の在庫数
	 */
	private int stockCount;

	
/*
 * メッソド
 */
	/**
	 * データベースの値を格納するDTOクラスを提供を取得します。
	 * @return データベースの値を格納するDTOクラスを提供
	 */
	public int getItemId() {
		return itemId;
	}
	/**
	 * データベースの値を格納するDTOクラスを提供を設定します。
	 * @param itemId データベースの値を格納するDTOクラスを提供
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/**
	 * itemNameを取得します。
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * itemNameを設定します。
	 * @param itemName itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * priceを取得します。
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * priceを設定します。
	 * @param price price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * itemCountを取得します。
	 * @return itemCount
	 */
	public int getItemCount() {
		return itemCount;
	}
	/**
	 * itemCountを設定します。
	 * @param itemCount itemCount
	 */
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	/**
	 * amountを取得します。
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * amountを設定します。
	 * @param amount amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * stockCountを取得します。
	 * @return stockCount
	 */
	public int getStockCount() {
		return stockCount;
	}
	/**
	 * stockCountを設定します。
	 * @param stockCount stockCount
	 */
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	/**
	 * indexを取得します。
	 * @return index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * indexを設定します。
	 * @param index index
	 */
	public void setIndex(int index) {
		this.index = index;
	}
}