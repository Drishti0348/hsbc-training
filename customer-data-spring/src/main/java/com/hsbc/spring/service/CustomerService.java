package com.hsbc.spring.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hsbc.spring.dao.impl.*;
import com.hsbc.spring.entity.Customer;

@Component
public class CustomerService {
	
	@Autowired
	private CustomerDaoImpl dao;

	
	public Customer getById(int id)
	{
		return dao.findById(id);	
	}
	
	public List<Customer> getDetails()
	{
		return dao.ListAll();
	}
	
	public boolean addCustomer(Customer c)
	{
		
		return dao.saveCustomer(c);
	}

}
