package action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.CartDeleteDAO;
/**
 * カート情報を削除するアクション
 * @author UEKI KAYO
 * @since 2017/03/21
 */

public class CartDeleteAction extends ActionSupport implements SessionAware{

	/**
	 * 商品ID
	 */
	private String itemId;
	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * セッション
	 */
	private Map<String,Object> session;

	/**
	 * 実行メソッド
	 *カート削除する
	 * @author UEKI KAYO
	 * @return result
	 */
	public String execute() throws SQLException{
		String ret = ERROR;
		userId=0;
		if(session.containsKey("userId")){
			userId= Integer.parseInt((String) session.get("userId"));
		}
		if(userId == 0){
			ret = ERROR;
		}else{
			CartDeleteDAO dao=new CartDeleteDAO();
			int rs=dao.delete(Integer.parseInt(itemId),userId);
			if(rs != 0) ret = SUCCESS;
		}
		return ret;
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
	 * sessionを取得します。
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * sessionを設定します。
	 * @param session session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
