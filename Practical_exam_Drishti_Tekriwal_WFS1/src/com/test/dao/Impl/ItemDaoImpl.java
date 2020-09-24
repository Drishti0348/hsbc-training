package com.test.dao.Impl;

import java.util.*;
import com.test.entity.*;
import com.test.dao.*;

public class ItemDaoImpl implements ItemDao {
	HashMap<Integer, FoodItems> foodList = new HashMap<>();
	HashMap<Integer, Apparel> appList = new HashMap<>();
	HashMap<Integer, Electronics> elecList = new HashMap<>();

	ItemDao dao;

	public ItemDaoImpl() {
		foodList.put(1, new FoodItems(1, "cake", 100, 20102020, 20122020, "yes", 2));
		foodList.put(2, new Fooditems(2, "biscuit", 100, 20102020, 20122020, "yes", 2));
		foodList.put(3, new Fooditems(3, "chips", 100, 20102020, 20122020, "yes", 5));
		foodList.put(4, new FoodItems(4, "rolls", 100, 20102020, 20122020, "yes", 4));

		appList.put(1, new Apparel(1, "dress", 200, "s", "cotton", 1));
		appList.put(2, new Apparel(2, "pants", 300, "m", "cotton", 3));
		appList.put(2, new Apparel(3, "jacket", 400, "s", "woolen", 1));
		appList.put(2, new Apparel(4, "shirt", 600, "s", "woolen", 5));

		elecList.put(1, new Electronics(1, "tv", 5000, 3, 12));
		elecList.put(2, new Electronics(2, "phone", 10000, 4, 12));
		elecList.put(3, new Electronics(3, "iron", 1000, 6, 12));
		elecList.put(4, new Electronics(4, "fridge", 5000, 1, 12));
		elecList.put(5, new Electronics(5, "fan", 500, 8, 12));

	}

	@Override
	public Apparel topSoldApparel() {

		Set<Integer> ak = appList.keySet();

		Iterator<Integer> itr = ak.iterator();
		Apparel max = null;

		while (itr.hasNext()) {
			int key = itr.next();
			Apparel a = appList.get(key);
			if (max.getQuantity() <= a.getQuantity())
				max = a;

		}
		return max;

	}

	@Override
	public Electronics topSoldElectronic() {
		Set<Integer> ek = appList.keySet();

		Iterator<Integer> itr = ek.iterator();
		Electronics max = null;

		while (itr.hasNext()) {
			int key = itr.next();
			Electronics e = elecList.get(key);
			if (max.getQuantity() <= e.getQuantity())
				max = e;

		}
		return max;

	}

	@Override
	public FoodItems topSoldFoodItem() {

		Set<Integer> fk = appList.keySet();

		Iterator<Integer> itr = fk.iterator();
		FoodItems max = null;

		while (itr.hasNext()) {
			int key = itr.next();
			FoodItems f = foodList.get(key);
			if (max.getQuantity() <= f.getQuantity())
				max = f;

		}
		return max;

	}

}
