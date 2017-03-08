package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.MyPageDAO;
import dto.MyPageDTO;
import java.sql.SQLException;
import java.util.*;


public class MyPageAction extends ActionSupport {
	private List<MyPageDTO> myInfo;
	private String userId;
	
	public String execute() throws NumberFormatException, SQLException{
		MyPageDAO dao = new MyPageDAO();
		myInfo = dao.select(Integer.parseInt(userId));
		return SUCCESS;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<MyPageDTO> getMyInfo() {
		return myInfo;
	}

	public void setMyInfo(List<MyPageDTO> myInfo) {
		this.myInfo = myInfo;
	}
}
