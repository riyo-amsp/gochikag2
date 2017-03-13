package action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import dto.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware {
	private String name;
	private String password;
	private String user_flg;
	private LoginDTO dto;

	private Map<String, Object> session;

	public String execute() throws SQLException {
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();

		dto = dao.select(name, password);
		String dtoName = dto.getName();
		String dtoPassword = dto.getPassword();
		/*
		System.out.println("Action");
		System.out.println(dtoName);
		System.out.println(dtoPassword);
		*/

		System.out.println("jsao");
		System.out.println(dto.getUser_flg());

		if (dto.getUser_flg().equals("3")) {
			System.out.println("HERE");
			if (password.equals(dto.getPassword())) {
				System.out.println("HERE");
				if (name.equals(dto.getName())) {
					ret = "admin";
				}
			}
		}
		if (dto.getUser_flg().equals("1")){
			ret = SUCCESS;
		}

		session.put("name", dto.getName());
		session.put("id", dto.getUser_id());

		return  ret;
	}

	/*
	 * public String getName() { return name; }
	 */

	public void setName(String name) {
		this.name = name;
	}
	/*
	 * public String getPassword() { return password; }
	 */

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