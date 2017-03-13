package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ItemAddDAO;

public class AdminAddAction extends ActionSupport {

	private String itemName;


	private float price;

	private int itemCount;


	private String registrationDate;


	private String updatedDate;


	private String mainPicture;


	private String pictures;

	private String detailJa;


	private String detailEn;


	private String category;

	private String textMsg;



	public String execute(){
		String result = ERROR;

		ItemAddDAO dao = new ItemAddDAO();
        dao.itemInsert(itemName, price, itemCount, registrationDate, updatedDate, mainPicture, pictures, detailJa, detailEn, category);
		//if(itemName!=null && price!=0 && mainPicture!=null && itemCount!=0 && registrationDate!=null && updatedDate!=null && pictures!=null && detailJa!=null && detailEn!=null && category!=null ){
		System.out.println("追加しました");
		result = SUCCESS;
		return result;
        }




	public String getTextMsg() {
		return textMsg;
	}


	public void setTextMsg(String textMsg) {
		this.textMsg = textMsg;
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


	public String getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}


	public String getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
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
