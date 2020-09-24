package com.test.view;
import com.test.dao.*;
import com.test.dao.Impl.ItemDaoImpl;
import com.test.service.*;

public class ItemMain {

	public static void main(String[] args) {
		
		ItemDao dao=new ItemDaoImpl();
		ItemService service=new ItemService(dao);
		service.popularApparel();
		service.popularFood();
		service.popularElectronic();
		
		
	}

}
