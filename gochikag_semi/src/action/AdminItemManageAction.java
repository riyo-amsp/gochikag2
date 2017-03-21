package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminItemManageDAO;
import dto.ItemDTO;

/**
 * 管理者画面にて商品検索する為のアクション
 *
 * @author SAKAMOTO YOSHIKAZU
 * @since 2017/03/13
 */
public class AdminItemManageAction extends ActionSupport {

	private int itemId;
	private String itemName;
	private String price;
	private int stockNumber;
	private String category;
	List<String> nameList = new ArrayList<String>();
	List<Float>priceList = new ArrayList<Float>();
	List<Integer>stockNumberList = new ArrayList<Integer>();
	List<Integer>itemIdList = new ArrayList<Integer>();
	List<String>mainPictureList = new ArrayList<String>();
	List<String> detailJaList = new ArrayList<String>();
	List<ItemDTO> dtoList;

	public String execute() {

		String ret = ERROR;
		AdminItemManageDAO dao = new AdminItemManageDAO();
		dtoList = dao.select1(category);
		for (ItemDTO dto : dtoList) {
			nameList.add(dto.getItemName());
			priceList.add(dto.getPrice());
			stockNumberList.add(dto.getStockNumber());
			itemIdList.add(dto.getItemId());
			mainPictureList.add(dto.getMainPicture());
			detailJaList.add(dto.getDetailJa());
		}

		if (!nameList.isEmpty()) {
			ret = SUCCESS;
		}
		return ret;
	}
	
	public List<Float> getPriceList() {
		return priceList;
	}
	public void setPriceList(List<Float> priceList) {
		this.priceList = priceList;
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

	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getNameList() {
		return nameList;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public List<ItemDTO> getDtoList() {
		return dtoList;
	}
	public void setDtoList(List<ItemDTO> dtoList) {
		this.dtoList = dtoList;
	}

	public int getStockNumber() {
		return stockNumber;
	}
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}

	public List<Integer> getStockNumberList() {
		return stockNumberList;
	}
	public void setStockNumberList(List<Integer> stockNumberList) {
		this.stockNumberList = stockNumberList;
	}
	
	public List<Integer> getItemIdList() {
		return itemIdList;
	}
	public void setItemIdList(List<Integer> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public List<String> getMainPictureList() {
		return mainPictureList;
	}
	public void setMainPictureList(List<String> mainPictureList) {
		this.mainPictureList = mainPictureList;
	}

	public List<String> getDetailJaList() {
		return detailJaList;
	}
	public void setDetailJaList(List<String> detailJaList) {
		this.detailJaList = detailJaList;
	}

}