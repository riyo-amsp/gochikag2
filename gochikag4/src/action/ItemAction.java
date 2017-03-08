package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ItemDAO;
import dto.ItemDTO;

public class ItemAction extends ActionSupport {

	private String itemId;
	private ItemDTO dto;
	//public ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

	public String execute() {

		ItemDAO dao = new ItemDAO();
		dto = dao.select(Integer.parseInt(itemId));
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



}
