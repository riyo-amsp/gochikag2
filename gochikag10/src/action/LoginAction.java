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
	private String userFlg;
	private String loginFlg;
	private int count;
	private LoginDTO dto;
	private LoginDTO dto2;

	private Map<String,Object>session;


	public String execute(){

		String ret = ERROR;

		LoginDAO dao = new LoginDAO();

		dto = dao.select(phoneEmail,password);

		System.out.println("action="+dto);
		System.out.println(phoneEmail);
		System.out.println(password);


		/*
		 * ログイン時のメールとパスワード認証
		 */
		if(phoneEmail.equals(dto.getPhoneEmail())){
			if(password.equals(dto.getPassword())){
				String flg = dto.getUserFlg();
				count = dao.count(phoneEmail,password);
				System.out.println(count);
				ret = SUCCESS;
				/*gochikagDBにデータが無ければinsertする
				 *
				 */
				if(count==0){
					dto2 = dao.insert(dto.getUserId(),dto.getPhoneEmail(),dto.getLoginFlg(),dto.getUserFlg(),dto.getPassword());
					System.out.println("dto2="+dto2);
					System.out.println(userId);

					if(dto2==null){
						/*insert出来なければエラーを返す
						 *
						 */
						return ret;
					}
				}
				/*
				 * user_flg = 3 （管理者）
				 */
				if(flg.equals("3")) {
					ret = "admin";
					System.out.println(ret);

				/*user_flg =1, 2 (一般)
				 *
				 */
				}else if((flg.equals("1"))&&(flg.equals("2"))){
				ret = SUCCESS;
				}

				/*ログインフラグをtrueにする
				 *
				 */
				System.out.println(count);
				int rs =0;
				rs= dao.update(phoneEmail, password);
				System.out.println("up="+rs);
				if(rs==0){
					/*update出来なければエラーを返す
					 *
					 */
					return ret;
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


	/**
	 * countを取得します。
	 * @return count
	 */
	public int getCount() {
	    return count;
	}


	/**
	 * countを設定します。
	 * @param count count
	 */
	public void setCount(int count) {
	    this.count = count;
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
		return (LoginDTO) dto2;
	}


	public void setDto2(LoginDTO dto2) {
		this.dto2 = (LoginDTO) dto2;
	}




}