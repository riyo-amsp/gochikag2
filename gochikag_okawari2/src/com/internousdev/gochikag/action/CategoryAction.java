package com.internousdev.gochikag.action;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.CategoryDAO;
import com.internousdev.gochikag.dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 各カテゴリーページへ遷移するアクション
 * @author TOMOYA IKARASHI
 * @since 2017/03/21
 * @version 1.1
 */
public class CategoryAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1993912193170390548L;
	/**
	 * カテゴリー名
	 */
	private String category;
	/**
	 * 商品の総数
	 */
	private List<CategoryDTO> items;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	
	/**
	 * 実行メソッド
	 * 各カテゴリーページへ遷移させるメソッド
	 * @author TOMOYA IKARASHI
	 * @return ret 変数categoryがもしnullでないなら、各カテゴリー名に対応したjspページに遷移、そうでない場合ログインしていたらmainへ、してないならtopへ遷移させる
	 */
	public String execute() throws SQLException{
		String ret = "error1";
		int userId=0;
		if(session.containsKey("userId")){
			userId = (int) session.get("userId");
		}
		if(category.equals(null) && category.length() == 0){
			if(userId == 0){
				return ret;
			}else{
				ret = "error2";
				return ret;
			}
		}
		ret = category;
		CategoryDAO dao = new CategoryDAO();
		items = dao.select(category);
		return category;
	}

	/**
	 * カテゴリーを取得します。
	 * @return カテゴリー
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * カテゴリーを設定します。
	 * @param category カテゴリー
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * 商品の総数を取得します。
	 * @return 商品の総数
	 */
	public List<CategoryDTO> getItems() {
		return items;
	}
	/**
	 * 商品の総数を設定します。
	 * @param items 商品の総数
	 */
	public void setItems(List<CategoryDTO> items) {
		this.items = items;
	}
	/**
	 * セッションを取得します。
	 * @return セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * セッションを設定します。
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
