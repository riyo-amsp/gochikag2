package dto;

public class ItemSearchDTO {

  private int itemId;

  private String itemName;

  private String mainPicture;

  private float price;

  private String registrationDate;

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

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getRegistrationDate() {
	return registrationDate;
}

public void setRegistrationDate(String registrationDate) {
	this.registrationDate = registrationDate;
}

}