package action;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import dao.CartUpdateDAO;

public class CartUpdateAction extends ActionSupport implements SessionAware{
	//フィールド
	private String itemCount;
	private String itemId;
	private int price;
	private int amount;
	private int userId; //sessionから取得
	private Map<String,Object> session;

	//executeメソッド
	public String execute() throws SQLException{
		
		CartUpdateDAO dao=new CartUpdateDAO();
		userId=0;
		if(session.containsKey("userId")){
			userId= Integer.parseInt((String) session.get("userId"));
		}
		
		int rs = dao.update(Integer.parseInt(itemId),Integer.parseInt(itemCount),price,amount,userId);
		if(rs != 0) return SUCCESS;
		return ERROR;
	}


	public String getItemCount() {
		return itemCount;
	}
	public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}