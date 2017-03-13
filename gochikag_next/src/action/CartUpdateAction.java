package action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.CartUpdateDAO;
import dto.CartUpdateDTO;

public class CartUpdateAction extends ActionSupport implements SessionAware{


	//フィールド
	private String itemCount;
	private int userId;
	private String itemId;
	private int price;
	private int amount;
	private List<CartUpdateDTO> itemList;
	private Map<String,Object> session;
	private int totalPrice;


	//executeメソッド
	public String execute() throws SQLException{

		System.out.println("tt");

		CartUpdateDAO dao=new CartUpdateDAO();
		CartUpdateDTO dto=new CartUpdateDTO();

		System.out.println("tekito");

		userId=0;
		if(session!=null){
			userId=(int)session.get("id");
			System.out.println(userId);

		}

		System.out.println("hima");

		int rs=dao.update(Integer.parseInt(itemId),Integer.parseInt(itemCount),price,amount,userId);

		//System.out.println("hima");

		itemList = new ArrayList<CartUpdateDTO>();
		itemList = dao.select(userId);
		totalPrice = 0;
		for(CartUpdateDTO item : itemList){
			totalPrice += item.getAmount();
		}

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


	public List<CartUpdateDTO> getItemList() {
		return itemList;
	}


	public void setItemList(List<CartUpdateDTO> itemList) {
		this.itemList = itemList;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


}