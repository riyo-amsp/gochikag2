package action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import dto.LoginDTO;



public class LoginAction extends ActionSupport implements SessionAware{
	
	private String email;
	private String password;
	private int userId;
	private String name;
	private String userFlg;
	private String loginFlg;
	private LoginDTO dto;

	private Map<String,Object>session;

	
	public String execute(){
	
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();

		dto = dao.select(name,userId,email,loginFlg,userFlg);

		if(email.equals(dto.getEmail())){
			if(password.equals(dto.getPassword())){
				if(dto.getUserFlg().equals("3")) {
					
					dto = dao.update(email,password);		
					
					ret = "admin";
					
				} else {
					
					dto = dao.update(email,password);
					
				
					ret=SUCCESS ;
				}
			}
		}
		
		
		
		session.put("id",dto.getUserId());
		
		return ret;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public String getUserFlg() {
		return userFlg;
	}


	public void setUserFlg(String userFlg) {
		this.userFlg = userFlg;
	}

	

	public String getLoginFlg() {
		return loginFlg;
	}


	public void setLoginFlg(String loginFlg) {
		this.loginFlg = loginFlg;
	}


	public LoginDTO getDto() {
		return dto;
	}


	public void setDto(LoginDTO dto) {
		this.dto = dto;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	
}