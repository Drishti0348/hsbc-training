package com.test.dao;
import com.test.entity.*;

public interface ItemDao {
	public FoodItems topSoldFoodItem();
	public Apparel topSoldApparel();
	public Electronics topSoldElectronic();
	
	

}
