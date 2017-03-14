/**
 *
 */
package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ItemDAO;

/**
 * @author SAKAMOTO
 * @since 2017/03/10
 *
 */
public class AdminItemManageAction extends ActionSupport {

	private String itemName;
	private String mainPicture;
	private float price;
	private int itemCount;
	private String pictures;
	private String detailJa;
	private String msg;

	public String execute() {
		String result = ERROR;
		this.msg = "更新できませんでした";

		ItemDAO dao = new ItemDAO();
		int con = dao.update(itemName, mainPicture, price, itemCount, pictures, detailJa);
		if (con > 0) {
			result = SUCCESS;
			this.msg = "更新しました";
		}
		return result;
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
