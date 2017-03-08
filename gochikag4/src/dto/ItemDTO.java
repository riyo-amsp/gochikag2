/**
 * 
 */
package dto;

/**
 * @author internousdev
 *
 */
public class ItemDTO {
	private int item_id;
	private String main_pictures;
	private float price;
	private int item_count;
	private String pictures;
	private int ditail_ja;
	
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getMain_pictures() {
		return main_pictures;
	}
	public void setMain_pictures(String main_pictures) {
		this.main_pictures = main_pictures;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getItem_count() {
		return item_count;
	}
	public void setItem_count(int item_count) {
		this.item_count = item_count;
	}
	public String getPictures() {
		return pictures;
	}
	public void setPictures(String pictures) {
		this.pictures = pictures;
	}
	public int getDitail_ja() {
		return ditail_ja;
	}
	public void setDitail_ja(int ditail_ja) {
		this.ditail_ja = ditail_ja;
	}
	
	
	
	
	
}
