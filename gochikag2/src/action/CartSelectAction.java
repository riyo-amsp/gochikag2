package action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.CartSelectDAO;
import dto.CartSelectDTO;


public class CartSelectAction extends ActionSupport implements SessionAware{

	//フィールド
	private String itemCount;
	private int userId;
	private String itemId;
	private int price;
	private int amount;
	private List<CartSelectDTO> itemList;
	private Map<String,Object> session;
	private int totalPrice;


	//executeメソッド
	public String execute() throws SQLException{

		//System.out.println("tt");

		CartSelectDAO dao=new CartSelectDAO();

		//System.out.println("tekito");

		userId=0;
		if(session!=null){
			userId=(int)session.get("id");
			System.out.println(userId);

		}

		System.out.println("hima");


		//System.out.println("hima");

		itemList = new ArrayList<CartSelectDTO>();
		itemList = dao.select(userId);
		totalPrice = 0;
		for(CartSelectDTO item : itemList){
			totalPrice += item.getAmount();
		}

		//setItemList(new ArrayList<CartUpdateDTO>());
		//setItemList(dao.select(userId));

		if(itemList==null){
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


	public List<CartSelectDTO> getItemList() {
		return itemList;
	}


	public void setItemList(List<CartSelectDTO> itemList) {
		this.itemList = itemList;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


}
