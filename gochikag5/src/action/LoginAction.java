package action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import dto.LoginDTO;



public class LoginAction extends ActionSupport implements SessionAware{
	private String name;
	private String password;
	private LoginDTO dto;

	private Map<String,Object>session;

	public String execute(){
		String ret =ERROR;
		LoginDAO dao =new LoginDAO();

		dto=dao.select(name,password);
		String dtoName=dto.getName();
		String dtoPassword=dto.getPassword();

		if(name.equals(dtoName)){
			if(dtoPassword.equals(dto.getPassword())){
				//dao.update();
				ret=SUCCESS ;
			}
		}
		session.put("name",dto.getName());
		session.put("id",dto.getId());

		return ret;
	}

	/*public String getName() {
		return name;
	}*/

	public void setName(String name) {
		this.name = name;
	}
	/*
	public String getPassword() {
		return password;
	}*/

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public LoginDTO getDto() {
		return dto;
	}

	public void setDto(LoginDTO dto) {
		this.dto = dto;
	}
}