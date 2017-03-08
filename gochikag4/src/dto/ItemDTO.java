/**
 *
 */
package dto;

/**
 * @author internousdev
 *
 */
public class ItemDTO {
	private String itemName;
	private int itemId;
	private String mainPictures;
	private float price;
	private int itemCount;
	private String pictures;
	private int ditailJa;

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getMainPictures() {
		return mainPictures;
	}
	public void setMainPictures(String mainPictures) {
		this.mainPictures = mainPictures;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public String getPictures() {
		return pictures;
	}
	public void setPictures(String pictures) {
		this.pictures = pictures;
	}
	public int getDitail_ja() {
		return ditailJa;
	}
	public void setDitail_ja(int ditail_ja) {
		this.ditailJa = ditail_ja;
	}

}