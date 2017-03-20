/**
 *
 */
package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminItemDeleteDAO;

/**
 * @author internousdev
 *
 */
public class AdminItemDeleteAction extends ActionSupport {
	private String deletMsg;
	private int number;
	private int itemId;
	private String itemName;
	private float price;
	private String mainPicture;

	public String execute() {

		String result = ERROR;

		AdminItemDeleteDAO deleteDao = new AdminItemDeleteDAO();
		int count = 0;
		count = deleteDao.delete(itemId);
		if (count > 0) {
			number = 1;
			System.out.println("number");
			this.deletMsg = "削除しました";
			result = SUCCESS;
		}

		return result;

	}

	public String getDeletMsg() {
		return deletMsg;
	}

	public void setDeletMsg(String deletMsg) {
		this.deletMsg = deletMsg;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMainPicture() {
		return mainPicture;
	}

	public void setMainPicture(String mainPicture) {
		this.mainPicture = mainPicture;
	}
}
