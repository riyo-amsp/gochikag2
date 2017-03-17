package action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.LogoutDAO;

public class LogoutAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private String phoneEmail;
	private String password;
	private int userId;
	private String itemId;

	public String execute()throws SQLException{

		/*
		  session.remove("name");
		  session.remove("id");
		 */

		System.out.println("user_id="+session);

		String ret = ERROR;
		LogoutDAO dao = new LogoutDAO();

		/*それぞれのDBの更新件数を格納
		 *
		 */
		int flg = 0;
		int flg2 = 0;
		flg= dao.update(phoneEmail, password);
		flg2 = dao.update2(phoneEmail, password);
		System.out.println("out="+flg);
		System.out.println("out2="+flg2);

		System.out.println(session+"2");

		/*gochikagDBのcartテーブルのデータを削除
		 *
		 */
		int rs=dao.delete(Integer.parseInt(itemId),userId);

		/*sessionを破棄する
		 *
		 */
		if((flg==0)&&(flg2==0)){
			((SessionMap<String, Object>)session).invalidate();
			ret = SUCCESS;
			System.out.println("sessionOut="+session+"3");
			System.out.println(ret);
		}else{
			/*update出来なければエラーを返す
			 *
			 */
			ret = ERROR;
		}
		return ret;
	}


	/**
	 * sessionを取得します。
	 * @return session
	 */
	public Map<String, Object> getSession(){
		return session;
	}


	/**
	 * sessionを設定します。
	 * @param session session
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}


	/**
	 * phoneEmailを取得します。
	 * @return phoneEmail
	 */
	public String getPhoneEmail() {
	    return phoneEmail;
	}


	/**
	 * phoneEmailを設定します。
	 * @param phoneEmail phoneEmail
	 */
	public void setPhoneEmail(String phoneEmail) {
	    this.phoneEmail = phoneEmail;
	}


	/**
	 * passwordを取得します。
	 * @return password
	 */
	public String getPassword() {
	    return password;
	}


	/**
	 * passwordを設定します。
	 * @param password password
	 */
	public void setPassword(String password) {
	    this.password = password;
	}


	/**
	 * userIdを取得します。
	 * @return userId
	 */
	public int getUserId() {
	    return userId;
	}


	/**
	 * userIdを設定します。
	 * @param userId userId
	 */
	public void setUserId(int userId) {
	    this.userId = userId;
	}


	/**
	 * itemIdを取得します。
	 * @return itemId
	 */
	public String getItemId() {
	    return itemId;
	}


	/**
	 * itemIdを設定します。
	 * @param itemId itemId
	 */
	public void setItemId(String itemId) {
	    this.itemId = itemId;
	}

}
