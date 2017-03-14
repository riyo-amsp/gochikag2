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

	private int itemId;
	private String itemName;
	private String price;
	private String itemCount;
	private String category;
	List<String> nameList = new ArrayList<String>();
	List<Integer>priceList = new ArrayList<Integer>();
	List<Integer>countList = new ArrayList<Integer>();
	List<ItemDTO> dtoList;

	public String execute() {

		String ret = ERROR;
		AdminItemManageDAO dao = new AdminItemManageDAO();
		dtoList = dao.select(category);

		for (ItemDTO dto : dtoList) {
			System.out.println("Action");
			System.out.println(dto.getItemName());
			System.out.println(dto.getPrice());
			System.out.println(dto.getItemCount());
			nameList.add(dto.getItemName());
			priceList.add(dto.getItemCount());
			countList.add(dto.getItemCount());
		}

		System.out.println("dtoチェック：" + nameList.size());

		if (!nameList.isEmpty()) {
			ret = SUCCESS;
		}
		return ret;
	}

	public List<Integer> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<Integer> priceList) {
		this.priceList = priceList;
	}

	public List<Integer> getCountList() {
		return countList;
	}

	public void setCountList(List<Integer> countList) {
		this.countList = countList;
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

	public String getItemCount() {
		return itemCount;
	}

	public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
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

}