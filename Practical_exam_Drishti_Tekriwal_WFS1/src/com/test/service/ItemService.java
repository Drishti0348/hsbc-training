package com.test.service;
import com.test.dao.*;
import com.test.entity.*;

public class ItemService {
	ItemDao dao;
	public ItemService(ItemDao dao) {
		this.dao=dao;
		
	}
	
	
	public void popularFood()
	{
		FoodItems f= dao.topSoldFoodItem();
		
		System.out.println(f.getItemCode()+" "+f.getItemName());
	}
	
	public void popularElectronic()
	{
		Electronics e= dao.topSoldElectronic();
		System.out.println(e.getItemCode()+" "+e.getItemName()+" "+e.getPrice()+" "+e.getQuantity()+" "+e.getWarrantyMonths());
	}
	public void popularApparel()
	{
		Apparel a= dao.topSoldApparel();
		System.out.println(a.getItemCode()+" "+a.getItemName()+" "+a.getPrice()+" "+a.getMaterial());
	}

}
