package action;

import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.*;
import dao.PayConfirmDAO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
import dto.PayConfirmDTO;

public class PayConfirmAction extends ActionSupport implements SessionAware {
	private String loginId;
	private String nameE;
	private String lastName;
	private String firstName;
	private String cardBrand;
	private String firstSixDigits;
	private int totalPrice;
	private Map<String, Object> session;
	
	public String execute() throws SQLException{
		int userId = 0;
		if(session.containsKey("userId")) userId = Integer.parseInt((String) session.get("userId"));
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String now = sdf.format(cal.getTime());
		PayConfirmDAO dao = new PayConfirmDAO();
		
		if(!dao.updateConfirmFlg(userId)) return ERROR;
		
		List<PayConfirmDTO> dtoList = dao.selectCartData(userId);
		
		if(!dao.insertIntoCredit(userId, cardBrand, nameE, loginId, firstSixDigits, totalPrice, now)) return ERROR;
		
		if(!dao.insertIntoUserHistroy(cardBrand, loginId, now, totalPrice, nameE, lastName, firstName)) return ERROR;
		
		if(!dtoList.isEmpty()){
			for(PayConfirmDTO dto : dtoList){
				if(!dao.insertIntoPurchase(dto.getItemId(), userId, dto.getItemCount(), dto.getAmount(), now)){
					return ERROR;
				}
				if(!dao.updateItemStock(dto.getItemId(), dto.getItemCount())){
					return ERROR;
				}
				if(!dao.deleteCartData(dto.getItemId(), userId)){
					return ERROR;
				}
			}
		}
		return SUCCESS;
	}
	

	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getNameE() {
		return nameE;
	}
	public void setNameE(String nameE) {
		this.nameE = nameE;
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
	public String getFirstSixDigits() {
		return firstSixDigits;
	}
	public void setFirstSixDigits(String firstSixDigits) {
		this.firstSixDigits = firstSixDigits;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
