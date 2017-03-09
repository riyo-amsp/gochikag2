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
	private String mainPicture;
	private float price;
	private int itemCount;
	private String pictures;
	private String detailJa;

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

	public String getMainPicture() {
		return mainPicture;
	}
	public void setMainPicture(String mainPicture) {
		this.mainPicture = mainPicture;
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
	public String getDetailJa() {
		return detailJa;
	}
	public void setDetailJa(String detailJa) {
		this.detailJa = detailJa;
	}

}