package com.javaex.problem03;

public class Goods {
	private String menu;
	private int price;
	private int quantity;
	
	public Goods() {}
	public Goods(String menu, int price, int quantity) {
		this.menu = menu;
		this.price = price;
		this.quantity = quantity;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void showInfo() {
		System.out.println(this.getMenu() + "(가격 : " 
						 + this.getPrice() + "원)이 "
						 + this.getQuantity() + "개 입고 되었습니다.");
	}
	
}
