package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.MyPageDAO;
import dto.MyPageDTO;
import java.sql.SQLException;
import java.util.*;


public class MyPageAction extends ActionSupport {
	private List<MyPageDTO> myInfo;
	private int userId;
	
	public String execute() throws NumberFormatException, SQLException{
		MyPageDAO dao = new MyPageDAO();
		myInfo = dao.select(userId);
		return SUCCESS;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<MyPageDTO> getMyInfo() {
		return myInfo;
	}

	public void setMyInfo(List<MyPageDTO> myInfo) {
		this.myInfo = myInfo;
	}
}
