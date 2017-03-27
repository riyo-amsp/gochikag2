package com.internousdev.gochikag.dto;
 
 
/**
 * AdminInfoDTO
 * @author YONESHIMA AI
 * @since 2017/03/16
 * @version 1.1
 */
public class AdminInfoDTO{
 
    /**
     * info（mongodb）の値 を格納するクラス
     * @author YONESHIMA AI
     * @since 2017/03/16
     * @version 1.1
     */
 
    private String title;
    private String name;
    private String mail;
    private String info;
    private String date;
 
 
    /**
     * titleを取得
     * @return title
     */
    public String getTitle() {
        return title;
    }
 
    /**titleを設定
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