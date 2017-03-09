package action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	
	public String execute(){
		((SessionMap)session).invalidate();
		/*
		  session.remove("name");
		  session.remove("id");
		 */
		return SUCCESS;
	}
	
	
	public Map<String, Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}

}
