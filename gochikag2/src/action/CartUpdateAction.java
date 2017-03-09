package action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import dao.CartUpdateDAO;

public class CartUpdateAction extends ActionSupport{


	//フィールド
	private String item_id;
	private String item_count;


	//executeメソッド
	public String execute() throws SQLException{

		CartUpdateDAO dao=new CartUpdateDAO();
		int rs=dao.update1(Integer.parseInt(item_id),Integer.parseInt(item_count));

		if(rs==0){
			return ERROR;
		}else{

		return SUCCESS;

		}

	}


	public String getItem_id() {
		return item_id;
	}


	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}


	public String getItem_count() {
		return item_count;
	}


	public void setItem_count(String item_count) {
		this.item_count = item_count;
	}
}


