package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.ItemDAO;
import dto.ItemDTO;

public class ItemAction extends ActionSupport {

	private String itemId;
	private ItemDTO dto;
	private int stockNumber;
	private int price;
	private List<Integer> stockNumberList;


	public String execute() {

		ItemDAO dao = new ItemDAO();
		dto = dao.select(Integer.parseInt(itemId));
		stockNumber = dto.getStockNumber();
		price = (int) dto.getPrice();
		stockNumberList = new ArrayList<Integer>();
		for(int i=0; i<=stockNumber; i++){
			stockNumberList.add(i);
		}
		return SUCCESS;
		}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public ItemDTO getDto() {
		return dto;
	}

	public void setDto(ItemDTO dto) {
		this.dto = dto;
	}
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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



}