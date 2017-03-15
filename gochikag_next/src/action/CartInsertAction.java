/**
 *
 */
package action;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import dao.CartInsertDAO;

/**
 * @author internousdev
 *
 */
public class CartInsertAction extends ActionSupport implements SessionAware{

	private int itemId;
	private int itemCount;
	private int price;
	private Map<String, Object> session;

	public String execute(){
		/*
		System.out.println("HERE");
		String ret = ERROR;
		int userId = 0;
		if(session != null){
			userId = (Integer) session.get("id");
		}
		int amount = itemCount * price;
		
		CartInsertDAO dao = new CartInsertDAO();
		int rs = dao.insert(userId, itemId, itemCount, amount);
		if(rs != 0){
			System.out.println("HERE");
			ret = SUCCESS;
		}
		return ret;
		*/
		return SUCCESS;
	}

	/**
	 * itemIdを取得します。
	 * @return itemId
	 */
	public int getItemId() {
	    return itemId;
	}

	/**
	 * itemIdを設定します。
	 * @param itemId itemId
	 */
	public void setItemId(int itemId) {
	    this.itemId = itemId;
	}

	/**
	 * itemCountを取得します。
	 * @return itemCount
	 */
	public int getItemCount() {
	    return itemCount;
	}

	/**
	 * itemCountを設定します。
	 * @param itemCount itemCount
	 */
	public void setItemCount(int itemCount) {
	    this.itemCount = itemCount;
	}

	
	public Map<String, Object> getSession() {
		return session;
	}

	@Override
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
