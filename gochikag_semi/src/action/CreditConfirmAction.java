package action;
import java.sql.SQLException;
import java.util.*;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import dao.CreditConfirmDAO;
import dto.CreditConfirmDTO;



public class CreditConfirmAction extends ActionSupport implements SessionAware{
	
/* userIdを取得するためにsessionから値を受け取る準備 */
	private Map<String, Object>session;
	
/* pay.jspから受け取る値一覧 */
	private String lastName;
	private String firstName;
	private String cardBrand;
	private String creditNumber1;
	private String creditNumber2;
	private String creditNumber3;
	private String creditNumber4;
	private int securityCode;
	private String expirationYear;
	private String expirationMonth;
	
/* クレジットの認証のために必要な変数を用意 */
	private int totalPrice;
	private int userId;
	private String loginId;
	private String nameE;
	private String expirationDay;
	private String firstSixDigits;
	private String lastFourDigits;
	
/* execute method*/
	public String execute() throws SQLException{
		
	/* クレジット認証に必要な変数群 */
		boolean checkedNumberFlag = false;
		boolean checkedCreditInfoFlag = false;
		CreditConfirmDAO dao = new CreditConfirmDAO();
		String stringCardBrand = convert(cardBrand);
		String creditNumber = creditNumber1 + creditNumber2 + creditNumber3 + creditNumber4;
		firstSixDigits = creditNumber.substring(0,6);
		lastFourDigits = creditNumber.substring(creditNumber.length()-4);
		System.out.println(firstSixDigits);
		System.out.println(lastFourDigits);
		nameE = lastName + " " +firstName;
		expirationDay = expirationYear + "-" + expirationMonth;
		
	/* Phase1: ユーザーがログインできていなかったらエラー */
		if(session.containsKey("userId")){
			userId= Integer.parseInt((String) session.get("userId"));
		}else {
			/*　ログインしてないからエラー */
			return ERROR;
		}
		
	/* Phase2: クレジットの上６桁の番号がvisa, master, amexのクレジット会社と照合するか確認。できなかったら上６桁のエラー */
		if(dao.select1(stringCardBrand, firstSixDigits)){
			System.out.println(firstSixDigits);
			checkedNumberFlag = true;
		}else{
			/* 上６桁が違うからエラー */
			return ERROR;
		}
		
	/* Phase3: 選択されたクレジットカード会社専用のDBを呼び出して、クレジット情報を照合する */
		CreditConfirmDTO dto = dao.select2(cardBrand, creditNumber);
		if(dto.getNameE().equals(nameE)){
			if(dto.getSecurityCode() == securityCode){
				if(dto.getExpirationDay().equals(expirationDay)){
					loginId = dto.getLoginId();
					checkedCreditInfoFlag = true;
				}else{
					/* 期限が違うからエラー */
					return ERROR;
				}
			}else{
				/* セキュリティ番号が違うからエラー */
				return ERROR;
			}
		}else{
			/* クレジット名義が違うからエラー */
			return ERROR;
		}
		
	/* Phase4: ユーザーがログイン状態であるかつ、クレジットカード上６桁の認証を通過しているかつ、クレジット情報の認証を通過しているかもう一度確認 */
		if(userId != 0 && checkedNumberFlag && checkedCreditInfoFlag){
			if(dao.update(userId)){
				totalPrice = dao.select3(userId);
				return SUCCESS;
			}
		}
		/* 予期せぬとしてエラー */
		return ERROR;
	}


	/* MySQLで使う検索ワードの生成 */
    private String convert(String cardBrand) {
        String stringCardBrand = null;
        if(cardBrand.equals("visa")) {
            stringCardBrand = "'%VISA%'";
        }else if(cardBrand.equals("master")) {
            stringCardBrand = "'%MasterCard%'";
        }else if(cardBrand== "amex") {
            stringCardBrand = "'%AMERICAN EXPRESS%' or 'アメリカン' or 'AMEX'";
        }
        return stringCardBrand;
    }
	
	/* pay.jspからconfirm.jspへ値の受け渡しが必要な変数のためgetterおよびsetter両方を用意 */
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getCardBrand() {
		return cardBrand;
	}
	public void setCardBrand(String cardBrand) {
		this.cardBrand = cardBrand;
	}
	
	
	/* pay.jspから値をもらうだけなのでsetterのみ必要な変数 */ 
	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	public void setExpirationDay(String expirationDay) {
		this.expirationDay = expirationDay;
	}
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}
	public void setCreditNumber1(String creditNumber1) {
		this.creditNumber1 = creditNumber1;
	}
	public void setCreditNumber2(String creditNumber2) {
		this.creditNumber2 = creditNumber2;
	}
	public void setCreditNumber3(String creditNumber3) {
		this.creditNumber3 = creditNumber3;
	}
	public void setCreditNumber4(String creditNumber4) {
		this.creditNumber4 = creditNumber4;
	}
	
	
	/* confirm.jspに値を渡すだけなのでgetterのみ必要な変数 */
	public String getNameE() {
		return nameE;
	}
	public String getLoginId() {
		return loginId;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public String getFirstSixDigits() {
		return firstSixDigits;
	}
	public String getLastFourDigits() {
		return lastFourDigits;
	}	
}
