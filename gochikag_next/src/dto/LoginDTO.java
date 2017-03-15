package dto;

public class LoginDTO {
	private int user_id;
	private String name;
	private String password;
	private String user_flg;
	private String login_flg;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_flg() {
		return user_flg;
	}
	public void setUser_flg(String user_flg) {
		this.user_flg = user_flg;
	}
	public String getLogin_flg() {
		return login_flg;
	}
	public void setLogin_flg(String login_flg) {
		this.login_flg = login_flg;
	}
}
