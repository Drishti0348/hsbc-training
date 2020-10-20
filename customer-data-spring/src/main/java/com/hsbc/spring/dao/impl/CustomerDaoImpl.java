package com.hsbc.spring.dao.impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.hsbc.spring.dao.*;
import com.hsbc.spring.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	private HashMap<Integer, Customer> db=new HashMap<>();
	
	public CustomerDaoImpl() {
		db.put(100, new Customer(100,"Drishti",824923));
		db.put(101, new Customer(101,"Payal",824924));
		db.put(102, new Customer(102,"Abhinav",824924));
		db.put(103, new Customer(103,"Raj",824925));
		db.put(104, new Customer(104,"Sneha",824926));
	}
	

	@Override
	public Customer findById(int id) {
		
			if(db.containsKey(id))
				return db.get(id);
			else
				throw new RuntimeException("something went wrong");
	}
	
	
	
	
	@Override
	public List<Customer> ListAll() {
		ArrayList<Customer> cusList=new ArrayList<>(db.values());
		return cusList;
		
	}
	
	
	
	@Override
	public boolean saveCustomer(Customer c) {
		if(db.containsKey(c.getCustomerId()))
			return true;
		else

		{
			db.put(c.getCustomerId(),c);
			return false; 
		}
			
	}


	
	
	
	
	

}
