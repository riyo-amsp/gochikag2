package action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import dto.LoginDTO;



public class LoginAction2 extends ActionSupport implements SessionAware{
	private String name;
	private String password;
	private List<LoginDTO> list;
	private LoginDTO dto;

	private Map<String,Object>session;

	public String execute(){
		String ret =ERROR;
		LoginDAO dao =new LoginDAO();
		dto =new LoginDTO();
		list = new ArrayList<LoginDTO>();

		dto=dao.select(name,password);
		//System.out.println(name +"  SODA  " +password);
		String dtoName=dto.getName();
		String dtoPassword=dto.getPassword();

		//System.out.println(dtoName +"  HIGE  " +dtoPassword);
		if(name.equals(dtoName)){
			if(dtoPassword.equals(dto.getPassword())){
				ret=SUCCESS ;
			}
		}
		session.put("name",dto.getName());
		dto.setUser_id(1);
		list.add(dto);

		LoginDTO dto2 = new LoginDTO();
		dto2.setUser_id(2);
		dto2.setName("hige");
		dto2.setPassword("kkk");
		list.add(dto2);

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

	public List<LoginDTO> getList() {
		return list;
	}

	public void setList(List<LoginDTO> list) {
		this.list = list;
	}

	public LoginDTO getDto() {
		return dto;
	}

	public void setDto(LoginDTO dto) {
		this.dto = dto;
	}
}
