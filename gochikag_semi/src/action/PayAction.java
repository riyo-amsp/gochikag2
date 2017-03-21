package action;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import dao.PayDAO;

public class PayAction extends ActionSupport implements SessionAware{
	
	private Map<String, Object> session;
	public String execute() throws SQLException{
		int userId = 0;
		String ret = ERROR;
		if(session.containsKey("userId")) {
			userId = Integer.parseInt((String) session.get("userId"));
		}
		PayDAO dao = new PayDAO();
		if(dao.update(userId)){
			ret = SUCCESS;
		}
		return ret;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
