package action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import dao.CartDeleteDAO;
import dto.CartUpdateDTO;


public class CartDeleteAction extends ActionSupport{


	//フィールド
	private String itemId;
	private int userId;
	private Map<String,Object> session;


	//executeメソッド
	public String execute() throws SQLException{

	/*	userId=0;
		if(session!=null){
			userId=(int)session.get("id");
			System.out.println(userId);
		}*/
		System.out.println("userId");
		System.out.println(userId);
		CartDeleteDAO dao=new CartDeleteDAO();
		List<CartUpdateDTO> itemList=new ArrayList<>();
		int rs=dao.delete(Integer.parseInt(itemId),userId);
		itemList = dao.select(userId);

		System.out.println(rs);



		if(rs==0){
			return ERROR;
		}else{

		return SUCCESS;

		}

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
