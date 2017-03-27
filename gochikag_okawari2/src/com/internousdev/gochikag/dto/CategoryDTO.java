package com.internousdev.gochikag.dto;

/**
 * CategoryDTO アイテムの値を格納するクラス
 * @author Tomohiro Konasaka
 * @since 3/10
 * @version 1.1
 */

public class CategoryDTO {
/*
 * フィールド	
 */
	/**
	 * 商品ID
	 */
	private int itemId;
	/**
	 * 商品名
	 */
	private String itemName;
	/**
	 * 商品価格
	 */
	private int price;
	/**
	 * 商品画像のパス
	 */
	private String url;
	/**
	 *  アイテムリストから値を取得するためのインデックス番号
	 */
	private int itemCount;

	
/*
 * メソッド
 */
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
	 * urlを取得します。
	 * @return url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * urlを設定します。
	 * @param url url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * itemIdを取得します。
	 * @return itemId
	 */
	public int getItemId() {
		return itemId;
	}
	/**
	 * itemIdを設定します。
	 * @param itemId itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
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
}
