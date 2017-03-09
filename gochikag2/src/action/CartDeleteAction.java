package action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import dao.CartDeleteDAO;


public class CartDeleteAction extends ActionSupport{


	//フィールド
	private String item_id;
	int user_id=getSession;


	//executeメソッド
	public String execute() throws SQLException{

		CartDeleteDAO dao=new CartDeleteDAO();
		int rs=dao.delete(Integer.parseInt(item_id),Integer.parseInt(user_id));

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


}


