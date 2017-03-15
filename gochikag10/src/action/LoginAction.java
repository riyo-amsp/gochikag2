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

	private Map<String,Object>session;


	public String execute(){

		String ret = ERROR;
		LoginDAO dao = new LoginDAO();

		dto = dao.select(userId,phoneEmail,loginFlg,userFlg);

		/*
		 * ログイン時のメールとパスワード認証
		 */
		if(phoneEmail.equals(dto.getPhoneEmail())){
			if(password.equals(dto.getPassword())){

				/*
				 * user_flg = 3 （管理者）
				 */
				if(dto.getUserFlg().equals("3")) {

					/*
					 * ログイン時のメールとパスワードが
					 * gochikag user(DB) と照合
					 */

					dto2 = dao.select2(phoneEmail, password);

					if(!(phoneEmail.equals(dto2.getPhoneEmail())) && !(password.equals(dto2.getPassword()))){

						LoginDTO in ;
						in = dao.insert(userId,phoneEmail,loginFlg,userFlg);
					}

					int rs =0;

					rs = dao.update(phoneEmail,password);

					ret = "admin";

				} else {


					dto2 = dao.select2(phoneEmail, password);

					if(!(phoneEmail.equals(dto2.getPhoneEmail())) && !(password.equals(dto2.getPassword()))){

						LoginDTO in ;
						in = dao.insert(userId,phoneEmail,loginFlg,userFlg);

					}

					int rs = 0;

					rs = dao.update(phoneEmail,password);


					ret=SUCCESS ;
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