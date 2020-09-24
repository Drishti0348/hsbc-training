package com.test.entity;

public class Apparel extends Items {
	private String size;
	private String material;
	

	public Apparel() {

	}

	public Apparel(int itemCode,String itemName,double price,String size,String material,int quantity) {
		super(itemCode,itemName,price,quantity);
		this.size=size;
		this.material=material;
		
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	
	

}
