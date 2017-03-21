package action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import dto.CartSelectDTO;
import dao.CartSelectDAO;


public class CartSelectAction extends ActionSupport implements SessionAware{
	//フィールド
	private int userId;
	private List<CartSelectDTO> itemList;
	private ArrayList tempStockList;
	private List<ArrayList> itemStockList;
	private Map<String,Object> session;
	private int totalPrice;

	//executeメソッド
	public String execute() throws SQLException{
		System.out.println("here");
		userId = 0;
		if(session.containsKey("userId")){
			userId= Integer.parseInt((String) session.get("userId"));
		}
		CartSelectDAO dao=new CartSelectDAO();
		itemList = new ArrayList<CartSelectDTO>();
		itemList = dao.select(userId);
		itemStockList = new ArrayList<ArrayList>();
		totalPrice = 0;
		
		for(CartSelectDTO item : itemList){
			totalPrice += item.getAmount();
			tempStockList = new ArrayList<Integer>();
			for(int i = 0; i <= item.getStockCount(); i++){
				tempStockList.add(i);
			}
			itemStockList.add(tempStockList);
		}
		
		if(itemList.isEmpty()) return ERROR;
		return SUCCESS;
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
	
	public List<ArrayList> getItemStockList() {
		return itemStockList;
	}
	public void setItemStockList(List<ArrayList> itemStockList) {
		this.itemStockList = itemStockList;
	}
}
