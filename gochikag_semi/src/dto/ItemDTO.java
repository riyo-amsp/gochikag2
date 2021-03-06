package dto;

/**
 * @author Yoshikazu Sakamoto
 * @since 3/9
 * @version 1.1
 */

public class ItemDTO {

	/*
	 * アイテムの値を格納するクラス
	 * @author Yoshikazu Sakamoto
     * @since 3/9
     * @version 1.1
	 */

	private String itemName;
	private int itemId;
	private String mainPicture;
	private String subPicture1;
	private String subPicture2;
	private String subPicture3;
	private float price;
	private int stockNumber;
	private String detailJa;

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
	 * mainPictureを取得します。
	 * @return mainPicture
	 */
	public String getMainPicture() {
		return mainPicture;
	}
	/**
	 * mainPictureを設定します。
	 * @param mainPicture mainPicture
	 */
	public void setMainPicture(String mainPicture) {
		this.mainPicture = mainPicture;
	}
	/**
	 * subPicture1を取得します。
	 * @return subPicture1
	 */
	public String getSubPicture1() {
		return subPicture1;
	}
	/**
	 * subPicture1を設定します。
	 * @param subPicture1 subPicture1
	 */
	public void setSubPicture1(String subPicture1) {
		this.subPicture1 = subPicture1;
	}
	/**
	 * subPicture2を取得します。
	 * @return subPicture2
	 */
	public String getSubPicture2() {
		return subPicture2;
	}
	/**
	 * subPicture2を設定します。
	 * @param subPicture2 subPicture2
	 */
	public void setSubPicture2(String subPicture2) {
		this.subPicture2 = subPicture2;
	}
	/**
	 * subPicture3を取得します。
	 * @return subPicture3
	 */
	public String getSubPicture3() {
		return subPicture3;
	}
	/**
	 * subPicture3を設定します。
	 * @param subPicture3 subPicture3
	 */
	public void setSubPicture3(String subPicture3) {
		this.subPicture3 = subPicture3;
	}
	/**
	 * priceを取得します。
	 * @return price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * priceを設定します。
	 * @param price price
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * detailJaを取得します。
	 * @return detailJa
	 */
	public String getDetailJa() {
		return detailJa;
	}
	/**
	 * detailJaを設定します。
	 * @param detailJa detailJa
	 */
	public void setDetailJa(String detailJa) {
		this.detailJa = detailJa;
	}
	/**
	 * stockNumberを取得します。
	 * @return stockNumber
	 */
	public int getStockNumber() {
		return stockNumber;
	}
	/**
	 * stockNumberを設定します。
	 * @param stockNumber stockNumber
	 */
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}

}