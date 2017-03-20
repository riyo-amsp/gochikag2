package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.ItemDAO;
import dto.ItemDTO;

public class ItemAction extends ActionSupport {

	private String itemId;
	private ItemDTO dto;
	private int count;
	private List<Integer> stockNumberList;

	// public ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

	public String execute() {

		ItemDAO dao = new ItemDAO();
		dto = dao.select(Integer.parseInt(itemId));
		count = dto.getStockNumber();
		stockNumberList = new ArrayList<Integer>();
		for (int i = 0; i <= count; i++) {
			stockNumberList.add(i);
		}

		// itemList= dao.select(item_id);

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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Integer> getStockNumberList() {
		return stockNumberList;
	}

	public void setStockNumberList(List<Integer> stockNumberList) {
		this.stockNumberList = stockNumberList;
	}

}
