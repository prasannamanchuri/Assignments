package com.capgemeni.Model;

public class Order {
	private int price;
	private String status;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [price=" + price + ", status=" + status + "]";
	}
	

}
