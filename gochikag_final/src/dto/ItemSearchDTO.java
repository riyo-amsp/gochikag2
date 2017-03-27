package dto;

public class ItemSearchDTO {

  private int itemId;

  private String itemName;

  private String mainPicture;

  private float price;

  private String registrationDate;

  private String category;

  private int searchSort;

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

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

/**
 * @return searchSort
 */
public int getSearchSort() {
	return searchSort;
}

/**
 * @param searchSort セットする searchSort
 */
public void setSearchSort(int searchSort) {
	this.searchSort = searchSort;
}

}