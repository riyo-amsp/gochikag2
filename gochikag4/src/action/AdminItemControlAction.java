/**
 *
 */
package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminItemUpdateDAO;

/**
 * @author sfszdgrzrdげrs
 *
 */
public class AdminItemControlAction extends ActionSupport {

	private int itemId;
	private String itemName;
	private String mainPicture;
	private int stockNumber;
	private String detailJa;
	private float price;

	public String execute() {
		String result = ERROR;

		AdminItemUpdateDAO dao = new AdminItemUpdateDAO();
		int con = dao.update(price, stockNumber, itemId);
		if (con > 0) {
			result = SUCCESS;
		}
		return result;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMainPicture() {
		return mainPicture;
	}

	public void setMainPicture(String mainPicture) {
		this.mainPicture = mainPicture;
	}

	public int getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}

	public String getDetailJa() {
		return detailJa;
	}

	public void setDetailJa(String detailJa) {
		this.detailJa = detailJa;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
