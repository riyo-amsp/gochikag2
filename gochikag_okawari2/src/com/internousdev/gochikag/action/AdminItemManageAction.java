package com.internousdev.gochikag.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.gochikag.dao.AdminItemManageDAO;
import com.internousdev.gochikag.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * AdminItemManageAction 管理者画面にて商品検索する為のアクション
 * @author Yoshikazu Sakamoto
 * @since 2017/03/13
 */
public class AdminItemManageAction extends ActionSupport {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -4266474220269058995L;
	/**
	 * 
	 */
	private int itemId;
	/**
	 * 
	 */
	private String itemName;
	/**
	 * 
	 */
	private String price;
	/**
	 * 
	 */
	private int stockNumber;
	/**
	 * 
	 */
	private String category;
	/**
	 * 
	 */
	private int phase;
	/**
	 * 
	 */
	private ItemDTO dto;
	/**
	 * 
	 */
	private List<String> nameList;
	/**
	 * 
	 */
	private List<Integer>stockNumberList;
	/**
	 * 
	 */
	private List<Integer> newStockNumberList;
	/**
	 * 
	 */
	private List<ItemDTO> dtoList;
	
	
	/**
	 * 実行メソッド
	 * 管理者画面にて商品検索、商品の在庫数の更新、および商品の削除を行うメソッド
	 * @author Yoshikazu Sakamoto
	 * @return ret 
	 * @throws SQLException エラー処理
	 */
	public String execute() throws SQLException {
		String ret = ERROR;
		newStockNumberList = new ArrayList<Integer>();
		for(int i = 1; i <= 100; i++){
			newStockNumberList.add(i);
		}
		AdminItemManageDAO dao = new AdminItemManageDAO();
		/*
		 * Phase4 : 商品の削除を行う
		 */
		if(phase == 4){
			if(dao.deleteFromDetail(itemId)){
				if(dao.deleteFromPictures(itemId)){
					if(dao.deleteFromItem(itemId)){
						
					}
				}
			}
		}
		
		/*
		 * Phase3 : 商品の在庫数を更新する
		 */
		if(phase == 3){
			if(dao.update(itemId, stockNumber) == 0) return ERROR;
		}
		
		/*
		 * Phase1 : カテゴリー検索の結果を管理者画面に返す
		 */
		nameList = dao.select1(category);
		if (!nameList.isEmpty()) ret = SUCCESS;
		if(phase == 1) {
			phase = 2;
			return ret;
		}
		
		/*
		 * Phase2 : 商品検索による、商品情報の結果を管理者画面に返す
		 */
		dto = dao.select2(itemName);
		if(dto.isItemFlg()) ret = SUCCESS;
		
		if(phase == 2){
			phase = 3;
			return ret;
		}
		return ret;
	}

	
	
	public ItemDTO getDto() {
		return dto;
	}
	public void setDto(ItemDTO dto) {
		this.dto = dto;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getNameList() {
		return nameList;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public List<ItemDTO> getDtoList() {
		return dtoList;
	}
	public void setDtoList(List<ItemDTO> dtoList) {
		this.dtoList = dtoList;
	}

	public int getStockNumber() {
		return stockNumber;
	}
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}

	public List<Integer> getStockNumberList() {
		return stockNumberList;
	}
	public void setStockNumberList(List<Integer> stockNumberList) {
		this.stockNumberList = stockNumberList;
	}
	public int getPhase() {
		return phase;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}
	
	public List<Integer> getNewStockNumberList() {
		return newStockNumberList;
	}

	public void setNewStockNumberList(List<Integer> newStockNumberList) {
		this.newStockNumberList = newStockNumberList;
	}

}