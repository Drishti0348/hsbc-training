package com.test.entity;

public class Items {
	private int itemCode;
	private String itemName;
	private double price;
	private int quantity;

	public Items() {
		
	}

	public Items(int itemCode, String itemName, double price,int quantity) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.quantity=quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean equals(Object obj) {
		Items i = (Items) obj;

		if (this.itemCode == i.getItemCode())
			return true;
		return false;

	}

	public int hashCode() {
		return this.itemCode;
	}

}
