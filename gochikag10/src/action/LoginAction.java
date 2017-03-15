package action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import dto.LoginDTO;



public class LoginAction extends ActionSupport implements SessionAware{

	private String phoneEmail;
	private String password;
	private String userId;
	//private String name;
	private String userFlg;
	private String loginFlg;
	private LoginDTO dto;
	private LoginDTO dto2;
	private LoginDTO dto3;

	private Map<String,Object>session;


	public String execute(){

		String ret = ERROR;
		LoginDAO dao = new LoginDAO();

		dto = dao.select(phoneEmail,password);
		dto2 = dao.select2(phoneEmail, password);

		System.out.println("action="+dto);
		System.out.println(phoneEmail);
		System.out.println(password);
		System.out.println(dto.getPhoneEmail());
		System.out.println(dto.getPassword());

		/*
		 * ログイン時のメールとパスワード認証
		 */
		if(phoneEmail.equals(dto.getPhoneEmail())){
			if(password.equals(dto.getPassword())){

				System.out.println(dto.getUserFlg());
				/*
				 * user_flg = 3 （管理者）
				 */
				if(dto.getUserFlg().equals("3")) {
					ret = "admin";
				}else if(dto2!=null){
				/*
				 * ログイン時のメールとパスワードが
				 * gochikag user(DB) と照合
				 */
				dto3 = dao.insert(userId,phoneEmail,loginFlg,userFlg,password);
				}
			}
		}



		session.put("id",dto.getUserId());

		return ret;
	}


	public String getPhoneEmail() {
		return phoneEmail;
	}


	public void setPhoneEmail(String phoneEmail) {
		this.phoneEmail = phoneEmail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	/*public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}*/




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


	public LoginDTO getDto2() {
		return dto2;
	}


	public void setDto2(LoginDTO dto2) {
		this.dto2 = dto2;
	}




}