package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminAddDAO;

public class AdminAddAction extends ActionSupport {

	private String itemName;


	private float price;

	private int itemCount;


	private String mainPicture;

	private String category;

	private String pictures;

	private String detailJa;

   private String detailEn;


	public String execute() {
		String result = ERROR;

		AdminAddDAO dao = new AdminAddDAO();
		System.out.println("updatddate" + itemName);
		dao.itemInsert(itemName, price, itemCount, mainPicture, pictures, detailJa, detailEn, category);
		if (itemName!=null || price!=0 || mainPicture!=null || itemCount!=0 || pictures!=null || detailJa!=null || detailEn!=null || category!=null) {
			System.out.println("追加しました");
			result = SUCCESS;

		}
		return result;
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


	public int getItemCount() {
		return itemCount;
	}


	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}



	public String getMainPicture() {
		return mainPicture;
	}


	public void setMainPicture(String mainPicture) {
		this.mainPicture = mainPicture;
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


	public String getDetailEn() {
		return detailEn;
	}


	public void setDetailEn(String detailEn) {
		this.detailEn = detailEn;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


}
