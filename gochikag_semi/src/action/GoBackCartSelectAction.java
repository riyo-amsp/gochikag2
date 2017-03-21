package action;
import java.sql.SQLException;
import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import dao.GoBackCartSelectDAO;


public class GoBackCartSelectAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	
	public String execute() throws SQLException{
		int userId = 0;
		if(session.containsKey("userId")){
			userId= Integer.parseInt((String) session.get("userId"));
		}
		
		GoBackCartSelectDAO dao = new GoBackCartSelectDAO();
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
