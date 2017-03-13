package action;
import dao.CategoryDAO;
import dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.*;

public class CategoryAction extends ActionSupport{
	private String category;
	private List<CategoryDTO> items;
	private List<String> lst = new ArrayList<String>();
	
	public String execute() throws SQLException{
		CategoryDAO dao = new CategoryDAO();
		items = dao.select(category);
		lst.add("1");
		lst.add("2");
		return category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<CategoryDTO> getItems() {
		return items;
	}

	public void setItems(List<CategoryDTO> items) {
		this.items = items;
	}
	
	public List<String> getLst() {
		return lst;
	}
	
	public void setLst(List<String> lst) {
		this.lst = lst;
	}
}
