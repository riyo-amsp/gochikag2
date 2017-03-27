package com.internousdev.gochikag.action;
 
import java.net.UnknownHostException;

import com.internousdev.gochikag.dao.InfoMongoDAO;
import com.opensymphony.xwork2.ActionSupport;
 
/**
 * ユーザーがお問い合わせ画面に情報を記入した際のアクション
 * @author Riyo Takahashi
 * @since 2017/03/16
 */
public class InfoMongoAction extends ActionSupport{
 
    /**
	 * シリアルID
	 */
	private static final long serialVersionUID = -7549986101640613076L;

	/**
     * 件名
     */
    private String title;
 
    /**
     * お名前
     */
    private String name;
 
    /**
     * メールアドレス
     */
    private String mail;
 
    /**
     * お問い合わせ内容
     */
    private String info;
 
 
    /**
     * 実行メソッド
     * 情報をmongoDBに値を入れるメソッド
     * @author Riyo Takahashi
     * @result result
     */
    public String execute(){
    	
        String result = ERROR;
        InfoMongoDAO dao = new InfoMongoDAO();
        try{ 
            boolean b=dao.insert(title,name, mail, info);
            /*
             * インサートできているか判断
             */
            if(b){
                result = SUCCESS;
            }
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        return result;
    }
 
 
    /**
     * titleを取得
     * @return title
     */
    public String getTitle() {
        return title;
    }
    /**
     * titleを設定
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }
 
    /**
     * nameを取得
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * nameを設定
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
 
    /**
     * mailを取得
     * @return mail
     */
    public String getMail() {
        return mail;
    }
    /**
     * mailを設定
     * @param mail mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
 
    /**
     * infoを取得
     * @return info
     */
    public String getInfo() {
        return info;
    }
    /**
     * infoを設定
     * @param info info
     */
    public void setInfo(String info) {
        this.info = info;
    }
}
