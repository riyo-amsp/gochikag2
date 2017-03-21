package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ログアウトする為のアクション
 * @author WATANABE JUNA
 * @since 2017/03/21
 * @version 1.1
 *
 */
public class LogoutAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;


	/**
	 * ログアウト実行メソッド
	 * @author WATANABE JUNA
	 */
	public String execute(){
		//((SessionMap)session).invalidate();
		session.remove("name");
		session.remove("id");
		return SUCCESS;
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

}
