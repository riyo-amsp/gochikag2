package action;

import java.sql.SQLException;
import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import dao.CartDeleteDAO;


public class CartDeleteAction extends ActionSupport implements SessionAware{
	//フィールド
	private String itemId;
	private int userId;
	private Map<String,Object> session;

	//executeメソッド
	public String execute() throws SQLException{
		userId=0;
		if(session.containsKey("userId")){
			userId= Integer.parseInt((String) session.get("userId"));
		}
		CartDeleteDAO dao=new CartDeleteDAO();
		int rs=dao.delete(Integer.parseInt(itemId),userId);
		if(rs != 0) return SUCCESS;
		return ERROR;
	}

	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
}
