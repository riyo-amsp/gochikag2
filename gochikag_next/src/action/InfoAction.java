package action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import dao.InfoDAO;

public class InfoAction extends ActionSupport{

	private String name;
	private String email;
	private String info;


	public String execute() throws SQLException{
		InfoDAO dao = new InfoDAO();
		int dto = 0;
		dto = dao.insert(name,email,info);

		if(dto == 0){
			return ERROR;
		}else{
			return SUCCESS;
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}

}