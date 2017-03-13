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
	private int price;
	private List<Integer>countList;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String execute() {

		ItemDAO dao = new ItemDAO();
		dto = dao.select(Integer.parseInt(itemId));
		count = dto.getItemCount();
		price = (int) dto.getPrice();
		countList = new ArrayList<Integer>();
		for(int i=0; i<=count; i++){
			countList.add(i);
		}

		//itemList= dao.select(item_id);

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

	public List<Integer> getCountList() {
		return countList;
	}

	public void setCountList(List<Integer> countList) {
		this.countList = countList;
	}

}