package dto;

public class CartUpdateDTO {

	//フィールド
	private int item_id;
	private String item_name;
	private int price;
	private int item_count;


	//item_count getter setter
	public int getItem_count() {
		return item_count;
	}

	public void setItem_count(int item_count) {
		this.item_count = item_count;
	}

	//item_id getter_setter
	public int getItem_id(){
		return item_id;
	}

	public void setItem_id(int item_id){
		this.item_id=item_id;
	}

	//item_name getter_setter
	public String getItem_name(){
		return item_name;
	}

	public void setItem_name(String item_name){
		this.item_name=item_name;
	}

	//price getter_setter
	public int getPrice(){
		return price;
	}

	public void setPrice(int price){
		this.price=price;
	}

}
