package com.internousdev.gochikag.action;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.gochikag.dao.AdminInfoDAO;
import com.internousdev.gochikag.dto.AdminInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理者画面からお問い合わせ画面へ移動
 * データ削除のtype=chainの更新
 * @author IKARASHI TOMOYA
 * @since 2017/03/16
 */
public class AdminInfoAction extends ActionSupport{

    /**
	 * シリアルID
	 */
	private static final long serialVersionUID = 6997186220108363440L;

	/**
     * お問い合わせ情報をすべてリストに格納
     */
    private List<AdminInfoDTO> infoList;

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
     * お問い合わせ日時
     */
    private String date;

    /**
     * 実行メソッド
     * リストに格納するため
     * （jsp画面でイテレーターで表示するため）
     * @author IKARASHI TOMOYA
     * @result result
     */

    public String execute(){

        String ret = ERROR;
        AdminInfoDAO dao = new AdminInfoDAO();
        infoList = new ArrayList<AdminInfoDTO>();

        try{
            infoList = dao.select();

        }catch(UnknownHostException e){
            e.printStackTrace();
        }

        ret = SUCCESS;

        return ret;

    }


    /**
     * infoListを取得
     * @return infoList
     */
    public List<AdminInfoDTO> getInfoList() {
        return infoList;
    }


    /**
     * infoListを設定
     * @param infoList infoList
     */
    public void setInfoList(List<AdminInfoDTO> infoList) {
        this.infoList = infoList;
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