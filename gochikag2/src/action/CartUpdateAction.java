package action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.CartUpdateDAO;

public class CartUpdateAction extends ActionSupport implements SessionAware{


	//フィールド
	private String itemCount;
	private int userId;
	private String itemId;
	private int price;
	private int amount;
	private Map<String,Object> session;


	//executeメソッド
	public String execute() throws SQLException{

		System.out.println("tt");

		CartUpdateDAO dao=new CartUpdateDAO();

		System.out.println("tekito");

		userId=0;
		if(session!=null){
			userId=(int)session.get("id");
			System.out.println(userId);

		}

		System.out.println("hima");

		int rs=dao.update(Integer.parseInt(itemId),Integer.parseInt(itemCount),price,amount,userId);

		//System.out.println("hima");


		//setItemList(new ArrayList<CartUpdateDTO>());
		//setItemList(dao.select(userId));

		if(rs==0){
			return ERROR;
		}else{

		return SUCCESS;

		}

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


