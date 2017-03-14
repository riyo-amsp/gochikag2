/**
 *
 */
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
public class AdminItemListAction extends ActionSupport {

	private int item_id;
	private String item_name;
	private String price;
	private String item_count;
	private String category;
	List<String> nameList = new ArrayList<String>();
	List<ItemDTO> dtoList;

	public String execute() {

		String ret = ERROR;
		AdminItemManageDAO dao = new AdminItemManageDAO();
		dtoList = dao.select(item_name);
		
		for (ItemDTO dto : dtoList) {
			nameList.add(dto.getItemName());
		}
		
		if(!nameList.isEmpty()) ret = SUCCESS;
		return ret;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getItem_count() {
		return item_count;
	}

	public void setItem_count(String item_count) {
		this.item_count = item_count;
	}

	public void setNameList(ArrayList<String> nameList) {
		this.nameList = nameList;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
