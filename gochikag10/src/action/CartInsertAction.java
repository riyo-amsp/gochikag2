/**
 *
 */
package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
/**
 *
 */

import dao.CartInsertDAO;
import dto.CartInsertDTO;

/**
 * @author internousdev
 *
 */
public class CartInsertAction extends ActionSupport{

	private String itemId="1";
	private String itemCount;

	public String execute(){
		String ret = ERROR;
		CartInsertDAO dao = new CartInsertDAO();
		ArrayList<CartInsertDTO> dto = new ArrayList<CartInsertDTO>();
		dto = dao.update(itemId,itemCount);
		if(dto!=null){
			ret = SUCCESS;
		}

		return ret;
	}

	/**
	 * itemIdを取得します。
	 * @return itemId
	 */
	public String getItemId() {
	    return itemId;
	}

	/**
	 * itemIdを設定します。
	 * @param itemId itemId
	 */
	public void setItemId(String itemId) {
	    this.itemId = itemId;
	}

	/**
	 * itemCountを取得します。
	 * @return itemCount
	 */
	public String getItemCount() {
	    return itemCount;
	}

	/**
	 * itemCountを設定します。
	 * @param itemCount itemCount
	 */
	public void setItemCount(String itemCount) {
	    this.itemCount = itemCount;
	}



}