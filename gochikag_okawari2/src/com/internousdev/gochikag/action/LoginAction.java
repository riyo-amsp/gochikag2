package com.internousdev.gochikag.action;
 
import java.sql.SQLException;
import java.util.Map;
 
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.LoginDAO;
import com.internousdev.gochikag.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;
 
/**
 * ログイン用のAction
 * @author Tomoya Ikarashi
 * @since 2017/03/11
 * @version 1.1
 */
public class LoginAction extends ActionSupport implements SessionAware{
    /**
	 * シリアルID
	 */
	private static final long serialVersionUID = -7297106149968247613L;
	/**
     * Eメール
     */
    private String phoneEmail;
    /**
     * パスワード
     */
    private String password;
    /**
     * ユーザーID
     */
    private String userId;
    /**
     * ユーザーフラッグ
     */
    private String userFlg;
    /**
     * ログインフラッグ
     */
    private String loginFlg;
    /**
     * カウント
     */
    private int count;
    /**
     * dtoリスト
     */
    private LoginDTO dto;
    /**
     * セッション
     */
    private Map<String,Object>session;
    /**
     * エラーメッセージ表示フラグ
     */
    private boolean errorFlg;
 
 
    /**
     * 実行メソッド 
     * ユーザーIDとパスワードでログインするメソッド
     * @author Tomoya Ikarashi
     * @return ret
     * @throws SQLException
     */
    public String execute()throws Exception{
        String ret = ERROR;
        LoginDAO dao = new LoginDAO();
        dto = dao.select(phoneEmail,password);
        errorFlg = false; 
        if(phoneEmail.equals(dto.getPhoneEmail())){
            if(password.equals(dto.getPassword())){
            	/*
            	 * gochikagDBのusers tableにログインしたユーザーが登録されているのかを確認する
            	 */
                if(!dao.checkUserExistence(phoneEmail, password)){
                	/*
                	 * 登録されていなかったら、gochikagDBのusers tableに改めてユーザーを登録するが、もし登録に失敗したらエラーを返す
                	 */
                    if(!dao.insertIntoUsers(dto.getUserId(), dto.getPhoneEmail(), dto.getLoginFlg(), dto.getUserFlg(), dto.getPassword()))
                    	errorFlg = true; 
                }
                String userFlg = dto.getUserFlg();
                /*
                 * userFlgによってログインを切り替える
                 * 1 or 2なら一般ユーザー
                 * 3なら管理者
                 */
                if(userFlg.equals("3")) {
                    ret = "admin";
                }else if((dto.getUserFlg().equals("1")) || (dto.getUserFlg().equals("2"))){
                	/*
                	 * ログインユーザーが一般ユーザーなら過去のカート情報を削除する
                	 */
                	dao.delete(dto.getUserId());
                	ret = SUCCESS;
                }else{
                	errorFlg = true; 
                }
                /*
                 *ログインフラグをtrueにする
                 */
                if(dao.updateGochikagLoginFlg(phoneEmail, password) && dao.updateOCLoginlg(phoneEmail, password)){
                    session.put("userId", dto.getUserId());
                }else{
                	errorFlg = true; 
                	ret = ERROR;
                }
              
            }else{
            	errorFlg = true; 
            }
        }else{
        	errorFlg = true; 
        }
        return ret;
    }
 
    /**
     * Eメールを取得します。
     * @return Eメール
     */
    public String getPhoneEmail() {
        return phoneEmail;
    }
 
    /**
     * Eメールを設定します。
     * @param phoneEmail Eメール
     */
    public void setPhoneEmail(String phoneEmail) {
        this.phoneEmail = phoneEmail;
    }
 
    /**
     * パスワードを取得します。
     * @return パスワード
     */
    public String getPassword() {
        return password;
    }
 
    /**
     * パスワードを設定します。
     * @param password パスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }
 
    /**
     * ユーザーIDを取得します。
     * @return ユーザーID
     */
    public String getUserId() {
        return userId;
    }
 
    /**
     * ユーザーIDを設定します。
     * @param userId ユーザーID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
 
    /**
     * ユーザーフラッグを取得します。
     * @return ユーザーフラッグ
     */
    public String getUserFlg() {
        return userFlg;
    }
 
    /**
     * ユーザーフラッグを設定します。
     * @param userFlg ユーザーフラッグ
     */
    public void setUserFlg(String userFlg) {
        this.userFlg = userFlg;
    }
 
    /**
     * ログインフラッグを取得します。
     * @return ログインフラッグ
     */
    public String getLoginFlg() {
        return loginFlg;
    }
 
    /**
     * ログインフラッグを設定します。
     * @param loginFlg ログインフラッグ
     */
    public void setLoginFlg(String loginFlg) {
        this.loginFlg = loginFlg;
    }
 
    /**
     * カウントを取得します。
     * @return カウント
     */
    public int getCount() {
        return count;
    }
 
    /**
     * カウントを設定します。
     * @param count カウント
     */
    public void setCount(int count) {
        this.count = count;
    }
 
    /**
     * dtoリストを取得します。
     * @return dtoリスト
     */
    public LoginDTO getDto() {
        return dto;
    }
 
    /**
     * dtoリストを設定します。
     * @param dto dtoリスト
     */
    public void setDto(LoginDTO dto) {
        this.dto = dto;
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
        this.session = (SessionMap<String, Object>)session;
    }
  
    /**
     * errorFlgを取得
     * @return errorFlg
     */
    public boolean isErrorFlg() {
        return errorFlg;
    }
    /**
     * errorFlgを設定
     * @param errorFlg errorFlg
     */
    public void setErrorFlg(boolean errorFlg) {
        this.errorFlg = errorFlg;
    }
}