package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminItemManageDAO;
import dto.ItemDTO;

/**
 * 管理者画面にて商品検索する為のアクション
 * @author SAKAMOTO YOSHIKAZU
 * @since 2017/03/13
 */

public class AdminItemManageAction extends ActionSupport {

	/**
	 * 商品ID
	 */
	private int itemId;
	/**
	 * 商品名
	 */
	private String itemName;
	/**
	 * 価格
	 */
	private String price;
	/**
	 * 在庫数
	 */
	private int stockNumber;
	/**
	 * カテゴリー
	 */
	private String category;
	/**
	 * 商品名をすべてリストに格納
	 */
	List<String> nameList = new ArrayList<String>();
	/**
	 * 価格をすべてリストに格納
	 */
	List<Float>priceList = new ArrayList<Float>();
	/**
	 *  在庫数をすべてリストに格納
	 */
	List<Integer>stockNumberList = new ArrayList<Integer>();
	/**
	 *  商品IDをすべてリストに格納
	 */
	List<Integer>itemIdList = new ArrayList<Integer>();
	/**
	 *  商品画像をすべてリストに格納
	 */
	List<String>mainPictureList = new ArrayList<String>();
	/**
	 * 詳細をすべてリストに格納
	 */
	List<String> detailJaList = new ArrayList<String>();
	/**
	 * dto配列
	 */
	List<ItemDTO> dtoList;


	/**
	 * 実行メソッド
	 *カテゴリー別にテーブル表記すつ為
	 * @author SAKAMOTO　YOSHIKAZU
	 * @return result
	 */
	public String execute() {

		String ret = ERROR;
		AdminItemManageDAO dao = new AdminItemManageDAO();
		dtoList = dao.select1(category);
		for (ItemDTO dto : dtoList) {
			nameList.add(dto.getItemName());
			priceList.add(dto.getPrice());
			stockNumberList.add(dto.getStockNumber());
			itemIdList.add(dto.getItemId());
			mainPictureList.add(dto.getMainPicture());
			detailJaList.add(dto.getDetailJa());
		}

		if (!nameList.isEmpty()) {
			ret = SUCCESS;
		}
		return ret;
	}


	/**
	 * priceListを取得します。
	 * @return priceList
	 */
	public List<Float> getPriceList() {
		return priceList;
	}


	/**
	 * priceListを設定します。
	 * @param priceList priceList
	 */
	public void setPriceList(List<Float> priceList) {
		this.priceList = priceList;
	}


	/**
	 * itemIdを取得します。
	 * @return itemId
	 */
	public int getItemId() {
		return itemId;
	}


	/**
	 * itemIdを設定します。
	 * @param itemId itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	/**
	 * itemNameを取得します。
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}


	/**
	 * itemNameを設定します。
	 * @param itemName itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	/**
	 * priceを取得します。
	 * @return price
	 */
	public String getPrice() {
		return price;
	}


	/**
	 * priceを設定します。
	 * @param price price
	 */
	public void setPrice(String price) {
		this.price = price;
	}


	/**
	 * categoryを取得します。
	 * @return category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * categoryを設定します。
	 * @param category category
	 */
	public void setCategory(String category) {
		this.category = category;
	}


	/**
	 * nameListを取得します。
	 * @return nameList
	 */
	public List<String> getNameList() {
		return nameList;
	}


	/**
	 * nameListを設定します。
	 * @param nameList nameList
	 */
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}


	/**
	 * dtoListを取得します。
	 * @return dtoList
	 */
	public List<ItemDTO> getDtoList() {
		return dtoList;
	}


	/**
	 * dtoListを設定します。
	 * @param dtoList dtoList
	 */
	public void setDtoList(List<ItemDTO> dtoList) {
		this.dtoList = dtoList;
	}


	/**
	 * stockNumberを取得します。
	 * @return stockNumber
	 */
	public int getStockNumber() {
		return stockNumber;
	}


	/**
	 * stockNumberを設定します。
	 * @param stockNumber stockNumber
	 */
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}


	/**
	 * stockNumberListを取得します。
	 * @return stockNumberList
	 */
	public List<Integer> getStockNumberList() {
		return stockNumberList;
	}


	/**
	 * stockNumberListを設定します。
	 * @param stockNumberList stockNumberList
	 */
	public void setStockNumberList(List<Integer> stockNumberList) {
		this.stockNumberList = stockNumberList;
	}


	/**
	 * itemIdListを取得します。
	 * @return itemIdList
	 */
	public List<Integer> getItemIdList() {
		return itemIdList;
	}


	/**
	 * itemIdListを設定します。
	 * @param itemIdList itemIdList
	 */
	public void setItemIdList(List<Integer> itemIdList) {
		this.itemIdList = itemIdList;
	}


	/**
	 * mainPictureListを取得します。
	 * @return mainPictureList
	 */
	public List<String> getMainPictureList() {
		return mainPictureList;
	}


	/**
	 * mainPictureListを設定します。
	 * @param mainPictureList mainPictureList
	 */
	public void setMainPictureList(List<String> mainPictureList) {
		this.mainPictureList = mainPictureList;
	}


	/**
	 * detailJaListを取得します。
	 * @return detailJaList
	 */
	public List<String> getDetailJaList() {
		return detailJaList;
	}


	/**
	 * detailJaListを設定します。
	 * @param detailJaList detailJaList
	 */
	public void setDetailJaList(List<String> detailJaList) {
		this.detailJaList = detailJaList;
	}

}