package com.test.entity;
import java.util.Date;

public class FoodItems extends Items{
	
	private Date dom;
	private Date doe;
	private String veg; 
	
	public FoodItems(){
		
	}
	
	public FoodItems(int itemCode,String itemName,double price,Date dom,Date doe, String veg,int quantity) {
		super(itemCode,itemName,price,quantity);
		this.dom=dom;
		this.doe=doe;
		this.veg=veg;
	}

	public Date getDom() {
		return dom;
	}

	public void setDom(Date dom) {
		this.dom = dom;
	}

	public Date getDoe() {
		return doe;
	}

	public void setDoe(Date doe) {
		this.doe = doe;
	}

	public String getVeg() {
		return veg;
	}

	public void setVeg(String veg) {
		this.veg = veg;
	}
	
	
	
	
}
