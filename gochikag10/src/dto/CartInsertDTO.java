/**
 *
 */
package dto;
/**
*
*/

/**
* @author internousdev
*
*/
public class CartInsertDTO {
	private String itemId;
	private String itemCount;

	public String getItemId(){
		return this.itemId;
	}

	public void setItemId(String itemId){
		this.itemId = itemId;
	}

	public String getItemCount(){
		return this.itemCount;
	}

	public void setItemCount(String itemCount){
		this.itemCount = itemCount;
	}

}
