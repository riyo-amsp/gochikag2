package com.internousdev.gochikag.action;

import java.net.UnknownHostException;

import com.internousdev.gochikag.dao.AdminInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 選択されたデータの削除
 * @author IKARASHI TOMOYA
 * @since 2017/03/22
 */
public class AdminInfoDeleteAction extends ActionSupport{

    /**
	 * シリアルID
	 */
	private static final long serialVersionUID = 3038754598889555293L;

	/**
     * メールアドレス
     */
    private String mail;

    /**
     * お問い合わせ日時
     */
    private String date;

    /**
     * 実行メソッド
     * データを削除するため
     * @author IKARASHI TOMOYA
     * @throws UnknownHostException
     * @result result
     */

    public String execute() throws UnknownHostException{
        String ret = ERROR;
        AdminInfoDAO dao = new AdminInfoDAO();

        try{
            boolean deleteFlg = dao.delete(mail, date);
            if(deleteFlg) ret = SUCCESS;
            	else return ret;


        }catch(UnknownHostException e){
            e.printStackTrace();

        }

        return ret;

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
     * dateを取得
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * dateを設定
     * @param date date
     */
    public void setDate(String date) {
        this.date = date;
    }


}
