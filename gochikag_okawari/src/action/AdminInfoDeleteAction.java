package action;
 
import java.net.UnknownHostException;
 
import com.opensymphony.xwork2.ActionSupport;
 
/**
 * 選択されたデータの削除
 * @author IKARASHI TOMOYA
 * @since 2017/03/22
 */
public class AdminInfoDeleteAction extends ActionSupport{
 
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
     * @result result
     */
 
    public String execute(){
 
        String ret = ERROR;
        dao.AdminInfoDAO dao = new dao.AdminInfoDAO();
 
        try{
 
            boolean b = dao.delete(mail, date);
 
            //System.out.println(mail);
            //System.out.println(date);
 
            if(b){
 
                ret = SUCCESS;
            }
 
 
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
