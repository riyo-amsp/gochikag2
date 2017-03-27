package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.ItemSearchDAO;
import dto.ItemSearchDTO;

public class ItemSearchAction extends ActionSupport {

	private int itemId;

	private String itemName;

	private int price;

	private String mainPicture;

	private String registrationDate;

	private String category;

	private String search;

	private int searchSort;


	public List<ItemSearchDTO> itemList = new ArrayList<ItemSearchDTO>();


	public String execute(){
	  String result = ERROR;
	  ItemSearchDAO dao = new ItemSearchDAO();

	  System.out.println(category);
	  System.out.println(searchSort);


	  if (itemList != null){
		  itemList = dao.select(category, searchSort);
		  System.out.println("itemList");
		  System.out.println(itemList);
		  if( itemList.size() > 0) {
			  result = SUCCESS;
		}
	  }
	  return result;
  }


	public int getSearchSort() {
		return searchSort;
	}

	public void setSearchSort(int searchSort) {
		this.searchSort = searchSort;
	}

	public List<ItemSearchDTO> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<ItemSearchDTO> itemList) {
		this.itemList = itemList;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMainPicture() {
		return mainPicture;
	}

	public void setMainPicture(String mainPicture) {
		this.mainPicture = mainPicture;
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


	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}



}