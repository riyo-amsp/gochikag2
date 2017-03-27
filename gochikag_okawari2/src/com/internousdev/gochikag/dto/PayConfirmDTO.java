package com.internousdev.gochikag.dto;

/**
 * PayConfirmDTO アイテムの値を格納するクラス
 * @author Kayoko Ueki
 * @since 3/10
 * @version 1.1
 */

public class PayConfirmDTO {
/*
 * フィールド	
 */
	/**
	 * 商品ID
	 */
	private int itemId;
	/**
	 * 商品数
	 */
	private int itemCount;
	/**
	 * 小計
	 */
	private int amount;

/*
 * メソッド	
 */
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

}
