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
		String ret = ERROR;
		int userId = 0;
		if(session != null){
			userId = (Integer) session.get("id");
		}
		int amount = itemCount * price;
		CartInsertDAO dao = new CartInsertDAO();
		List<Integer> itemIdList = dao.select(userId, itemId);
		for(Integer i : itemIdList){
			if(i == itemId){
				return SUCCESS;
			}
		}
		
		int rs = dao.insert(userId, itemId, itemCount, amount);
		if(rs != 0){
			ret = SUCCESS;
		}
		return ret;
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
