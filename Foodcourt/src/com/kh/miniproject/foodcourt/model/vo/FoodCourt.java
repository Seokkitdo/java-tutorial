package com.kh.miniproject.foodcourt.model.vo;

public class FoodCourt {
	private String menuname;
	private int price;
	
	public FoodCourt() {}
	public FoodCourt(String menuname, int price) {
		this.menuname = menuname;
		this.price = price;
	}
	
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenuname() {
		return menuname;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "메뉴 : " + menuname + "가격 : " + price;
	}
	
}
