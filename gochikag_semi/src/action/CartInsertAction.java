/**
 *
 */
package action;
import java.util.*;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import dao.CartInsertDAO;


public class CartInsertAction extends ActionSupport implements SessionAware{

	private int itemId;
	private int itemCount;
	private int price;
	private Map<String, Object> session;

	public String execute(){
		int userId = 0;
		if(session.containsKey("userId")){
			userId= Integer.parseInt((String) session.get("userId"));
		}
		
		int amount = itemCount * price;
		CartInsertDAO dao = new CartInsertDAO();
		
		List<Integer> itemIdList = dao.select(userId, itemId);
		for(Integer i : itemIdList){
			//もし同じitemIdの商品をcartに入れようとしている場合はそれを防ぐ
			if(i == itemId) return SUCCESS;
		}
		
		int rs = dao.insert(userId, itemId, itemCount, amount);
		if(rs != 0) return SUCCESS;
		return ERROR;
	}

	public int getItemId() {
	    return itemId;
	}
	public void setItemId(int itemId) {
	    this.itemId = itemId;
	}

	public int getItemCount() {
	    return itemCount;
	}
	public void setItemCount(int itemCount) {
	    this.itemCount = itemCount;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
