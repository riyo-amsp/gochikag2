package com.internousdev.gochikag.action;
import java.sql.SQLException;
import java.util.*;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.gochikag.dao.CreditConfirmDAO;
import com.internousdev.gochikag.dto.CreditConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;



/**
 *クレジット情報を認証するアクション
 * @author Kazune Miyagi
 * @since 2017/03/19
 * @version 1.1
 *
 */
public class CreditConfirmAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 6826185481211785552L;


/* 
 * userIdを取得するためにsessionから値を受け取る準備 
 */
	/**
	 * セッション
	 */
	private Map<String, Object>session;

	
/* 
 * pay.jspから受け取る値一覧
 */
	/**
	 * 名字
	 */
	private String lastName;
	/**
	 * 名前
	 */
	private String firstName;
	/**
	 * カード会社
	 */
	private String cardBrand;
	/**
	 * クレジットカード番号１区切り目
	 */
	private String creditNumber1;
	/**
	 * クレジットカード番号２区切り目
	 */
	private String creditNumber2;
	/**
	 * クレジットカード番号３区切り目
	 */
	private String creditNumber3;
	/**
	 * クレジットカード番号４区切り目(visaの場合のみ存在する)
	 */
	private String creditNumber4;
	/**
	 * クレジットカードのセキュリティコード
	 */
	private int securityCode;
	/**
	 * クレジットカードの有効年
	 */
	private String expirationYear;
	/**
	 * クレジットカードの有効月
	 */
	private String expirationMonth;
	/**
	 * クレジットカードの有効年数リスト
	 */
	private List<String> years; 

	
/* 
 * クレジットの認証のために必要な変数を用意 
 */
	/**
	 * 買い物合計金額
	 */
	private int totalPrice;
	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * ログインID (クレジットカード認証用)
	 */
	private String loginId;
	/**
	 * カード名義
	 */
	private String nameE;
	/**
	 * クレジットカードの有効期限
	 */
	private String expirationDay;
	/**
	 * クレジットカードの最初の6桁
	 */
	private String firstSixDigits;
	/**
	 * クレジットカードの最後の4桁
	 */
	private String lastFourDigits;
	/**
	 * エラーメッセージの振り分け
	 */
	private int errorValue;

	/**
	 * 実行メソッド
	 * クレジット情報を認証するメソッド
	 * @author MIYAGI KAZUNE
	 * @return ret ログイン認証が取れない場合はERROR、クレジットカード入力情報に不備がある場合はmissing、全て正しく認証が取れた場合はSUCCESSを返す
	 * @throws SQLException エラー処理
	 */
	public String execute() throws SQLException{

	/* 
	 * クレジット認証に必要な変数群 
	 */
		boolean checkedNumberFlag = false;
		boolean checkedCreditInfoFlag = false;
		CreditConfirmDAO dao = new CreditConfirmDAO();
		String stringCardBrand = convert(cardBrand);
		String creditNumber = creditNumber1 + creditNumber2 + creditNumber3 + creditNumber4;
		firstSixDigits = creditNumber.substring(0,6);
		lastFourDigits = creditNumber.substring(creditNumber.length()-4);
		nameE = lastName + " " +firstName;
		expirationDay = expirationYear + "-" + expirationMonth;
		String ret = "missing";
		errorValue = 0;
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		years = new ArrayList<String>();
		for(int i = 0; i <= 4; i++){
			years.add(Integer.toString(year));
			year++;
		}
		
	/* 
	 * Phase1: ユーザーがログインしているかの確認をする。
	 */
		if(session.containsKey("userId")){
			userId = (int) session.get("userId");
		}else {
			/*　
			 * ログインが出来てないからエラーを返す。
			 */
			ret = ERROR;
			return ret;
		}
		
	/* 
	 * Phase2: クレジットの上６桁の番号がvisa, master, amexのいずれかのクレジット会社と照合するかを確認する。 
	 */
		if(dao.select1(stringCardBrand, firstSixDigits)){
			checkedNumberFlag = true;
		}else{
			/* 
			 * 上６桁が違うからエラーメッセージを返す。
			 */
			errorValue = 1;
			return ret;
		}

	/* 
	 * Phase3: 選択されたクレジットカード会社専用のDBを呼び出して、クレジット情報を照合する。
	 */
		CreditConfirmDTO dto = dao.select2(cardBrand, creditNumber);
		if(dto.getNameE().equals(nameE)){
			if(dto.getSecurityCode() == securityCode){
				if(dto.getExpirationDay().equals(expirationDay)){
					loginId = dto.getLoginId();
					checkedCreditInfoFlag = true;
				}else{
					/* 
					 * 期限が違うからエラーメッセージを返す。
					 */
					errorValue = 2;
					return ret;
				}
			}else{
				/* 
				 * セキュリティ番号が違うからエラーメッセージを返す。
				 */
				errorValue = 3;
				return ret;
			}
		}else{
			/* 
			 * クレジット名義が違うからエラーメッセージを返す。
			 */
			errorValue = 4;
			return ret;
		}
	/* 
	 * Phase4: ユーザーがログイン状態であるかつ、クレジットカード上６桁の認証を通過しているかつ、クレジット情報の認証を通過しているかもう一度確認する。 
	 */
		if(userId != 0 && checkedNumberFlag && checkedCreditInfoFlag){
			if(dao.update(userId)){
				totalPrice = dao.select3(userId);
				ret = SUCCESS;
				return ret;
			}
		}
		/* 
		 * 予期せぬエラーが発生しているので強制的にログアウトする。
		 */
		ret = ERROR;
		return ret;
	}


	/**
	 *  MySQLで使う検索ワードの生成します。
	 *  @param cardBrand クレジット会社
	 *  @return stringCardBrand クレジット会社のlike検索文
	 */
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

/* 
 * pay.jspからconfirm.jspへ値の受け渡しが必要な変数のためgetterおよびsetter両方を用意 
 */   
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

	/**
	 * lastNameを取得します。
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * lastNameを設定します。
	 * @param lastName lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * firstNameを取得します。
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * firstNameを設定します。
	 * @param firstName firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * cardBrandを取得します。
	 * @return cardBrand
	 */
	public String getCardBrand() {
		return cardBrand;
	}
	/**
	 * cardBrandを設定します。
	 * @param cardBrand cardBrand
	 */
	public void setCardBrand(String cardBrand) {
		this.cardBrand = cardBrand;
	}
	
	/**
	 * errorValueを取得します。
	 * @return errorValue エラーの内容
	 */
	public int getErrorValue() {
		return errorValue;
	}
	/**
	 * errorValueを設定します。
	 * @param errorValue errorValue
	 */
	public void setErrorValue(int errorValue) {
		this.errorValue = errorValue;
	}
	/**
	 * クレジットカードの有効年数リストを取得します
	 * @return　years クレジットカードの有効年数リスト
	 */
	public List<String> getYears() {
		return years;
	}
	/**
	 * クレジットカードの有効年数リストを設定します。
	 * @param　years クレジットカードの有効年数リスト
	 */
	public void setYears(List<String> years) {
		this.years = years;
	}


/* 
 * pay.jspから値をもらうだけなのでsetterのみ必要な変数群
 */
	/**
	 * expirationMonthを設定します。
	 * @param expirationMonth expirationMonth
	 */
	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	/**
	 * expirationDayを設定します。
	 * @param expirationDay expirationDay
	 */
	public void setExpirationDay(String expirationDay) {
		this.expirationDay = expirationDay;
	}
	/**
	 * securityCodeを設定します。
	 * @param securityCode securityCode
	 */
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
	/**
	 * expirationYearを設定します。
	 * @param expirationYear expirationYear
	 */
	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}
	/**
	 * creditNumber1を設定します。
	 * @param creditNumber1 creditNumber1
	 */
	public void setCreditNumber1(String creditNumber1) {
		this.creditNumber1 = creditNumber1;
	}
	/**
	 * creditNumber2を設定します。
	 * @param creditNumber2 creditNumber2
	 */
	public void setCreditNumber2(String creditNumber2) {
		this.creditNumber2 = creditNumber2;
	}
	/**
	 * creditNumber3を設定します。
	 * @param creditNumber3 creditNumber3
	 */
	public void setCreditNumber3(String creditNumber3) {
		this.creditNumber3 = creditNumber3;
	}
	/**
	 * creditNumber4を設定します。
	 * @param creditNumber4 creditNumber4
	 */
	public void setCreditNumber4(String creditNumber4) {
		this.creditNumber4 = creditNumber4;
	}

	
/* 
 * confirm.jspに値を渡すだけなのでgetterのみ必要な変数群 
 */	
	/**
	 * nameEを取得します。
	 * @return nameE
	 */
	public String getNameE() {
		return nameE;
	}
	/**
	 * loginIdを取得します。
	 * @return loginId
	 */
	public String getLoginId() {
		return loginId;
	}
	/**
	 * totalPriceを取得します。
	 * @return totalPrice
	 */
	public int getTotalPrice() {
		return totalPrice;
	}
	/**
	 * firstSixDigitsを取得します。
	 * @return firstSixDigits
	 */
	public String getFirstSixDigits() {
		return firstSixDigits;
	}
	/**
	 * lastFourDigitsを取得します。
	 * @return lastFourDigits
	 */
	public String getLastFourDigits() {
		return lastFourDigits;
	}
}
