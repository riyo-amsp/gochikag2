package action;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
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

	public String execute()throws Exception{

		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		dto = dao.select(phoneEmail,password);

		session.put("userId",dto.getUserId());
		System.out.println("LOGIN IDだよ");
		System.out.println(session.get("userId"));
		
		/*
		 * ログイン時のメールとパスワード認証
		 */
		if(phoneEmail.equals(dto.getPhoneEmail())){
			if(password.equals(dto.getPassword())){
				/*gochikagDBにデータが無ければinsertする
				 *
				 */
				count = dao.count(phoneEmail,password);
				System.out.println("actionCount="+count);
				ret = SUCCESS;

				if(count==0){
					dto2 = dao.insert(dto.getUserId(),dto.getPhoneEmail(),dto.getLoginFlg(),dto.getUserFlg(),dto.getPassword());

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
				String flg = dto.getUserFlg();
				if(flg.equals("3")) {
					ret = "admin";
					System.out.println(ret);

				/*user_flg =1, 2 (一般)
				 *
				 */
				}else if((flg.equals("1"))&&(flg.equals("2"))){
					System.out.println("userFlg="+flg);
				ret = SUCCESS;
				}

				/*ログインフラグをtrueにする
				 *
				 */
				int lFlg = dao.update(phoneEmail, password);
				int lFlg2 = dao.update2(phoneEmail, password);
				System.out.println("update="+lFlg);
				System.out.println("update2="+lFlg2);

				int rs =0;
				if(rs==0){
					/*update出来なければエラーを返す
					 *
					 */
					return ret;
				}

			}
		}
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
		this.session = (SessionMap<String, Object>)session;
	}

	public LoginDTO getDto2() {
		return (LoginDTO) dto2;
	}
	public void setDto2(LoginDTO dto2) {
		this.dto2 = (LoginDTO) dto2;
	}
}