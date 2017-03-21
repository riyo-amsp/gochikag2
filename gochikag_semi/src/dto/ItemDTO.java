
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
	private String subPicture1;
	private String subPicture2;
	private String subPicture3;
	private float price;
	private int stockNumber;
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
	public String getSubPicture1() {
		return subPicture1;
	}
	public void setSubPicture1(String subPicture1) {
		this.subPicture1 = subPicture1;
	}
	public String getSubPicture2() {
		return subPicture2;
	}
	public void setSubPicture2(String subPicture2) {
		this.subPicture2 = subPicture2;
	}
	public String getSubPicture3() {
		return subPicture3;
	}
	public void setSubPicture3(String subPicture3) {
		this.subPicture3 = subPicture3;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public String getDetailJa() {
		return detailJa;
	}
	public void setDetailJa(String detailJa) {
		this.detailJa = detailJa;
	}
	public int getStockNumber() {
		return stockNumber;
	}
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}

}