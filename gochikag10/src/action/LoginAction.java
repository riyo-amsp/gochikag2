package action;


import java.sql.ResultSet;
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
	private ResultSet dto2;

	private Map<String,Object>session;


	public String execute(){

		System.out.println("ass");

		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		System.out.println(ret);

		dto = dao.select(phoneEmail,password);
		System.out.println(dto);
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

					/*
					 * ログイン時のメールとパスワードが
					 * gochikag user(DB) と照合
					 */

					System.out.println("wata");

					dto2 = dao.select2(phoneEmail, password);
					System.out.println("action"+dto2);

					System.out.println("nabe");
					//System.out.println(dto2.getPhoneEmail());
					//System.out.println(dto2.getPassword());

					if(dto2.equals(dto.getUserId()) ){

						System.out.println("ju");

					}else{

						LoginDTO in ;

						System.out.println(userId);
						in = dao.insert(dto.getUserId(),dto.getPhoneEmail(),dto.getLoginFlg(),dto.getUserFlg());

						System.out.println("n");
					}

					int rs =0;

					rs = dao.update(phoneEmail,password);

					System.out.println("a");

					ret = "admin";

				} else {


					dto2 = dao.select2(phoneEmail, password);

					if(dto2.equals(dto.getUserId())){

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


	public ResultSet getDto2() {
		return dto2;
	}


	public void setDto2(ResultSet dto2) {
		this.dto2 = dto2;
	}




}