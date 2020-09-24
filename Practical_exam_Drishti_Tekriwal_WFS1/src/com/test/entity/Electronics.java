package com.test.entity;

public class Electronics extends Items {

	private int warrantyMonths;

	public Electronics() {

	}

	public Electronics(int itemCode, String itemName, double price, int quantity, int warrantyMonths) {
		super(itemCode, itemName, price, quantity);
		this.warrantyMonths = warrantyMonths;

	}

	public int getWarrantyMonths() {
		return warrantyMonths;
	}

	public void setWarrantyMonths(int warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
	}

}
