package com.hsbc.spring.dao;
import com.hsbc.spring.entity.*;
import java.util.*;

public interface CustomerDao {
	public Customer findById(int id);
	public List<Customer> ListAll();
	public boolean saveCustomer(Customer c);

}
