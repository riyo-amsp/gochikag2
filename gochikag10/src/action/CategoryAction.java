package action;
import dao.CategoryDAO;
import dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.*;

public class CategoryAction extends ActionSupport{
	private String category;
	private List<CategoryDTO> items;
	
	public String execute() throws SQLException{
		CategoryDAO dao = new CategoryDAO();
		items = dao.select(category);
		for(CategoryDTO item : items ){
			System.out.println(item.getItemName());
			System.out.println(item.getPrice());
			System.out.println(item.getUrl());
		}
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
}
