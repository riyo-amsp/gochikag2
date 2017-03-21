package action;
import java.sql.SQLException;
import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import dao.GoBackCreditConfirmDAO;


public class GoBackCreditConfirmAction extends ActionSupport implements SessionAware{
	
	private Map<String, Object> session;
	
	public String execute(){
		int userId = 0;
		if(session.containsKey("userId")){
			userId= Integer.parseInt((String) session.get("userId"));
		}
		GoBackCreditConfirmDAO dao = new GoBackCreditConfirmDAO();
		if(dao.update(userId)){
			return SUCCESS;
		}
		return ERROR;
	}

	
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;	
	}	
}
