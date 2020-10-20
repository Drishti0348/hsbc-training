package com.hsbc.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hsbc.spring.JdbcConfig;
import com.hsbc.spring.dao.CustomerDao;
import com.hsbc.spring.entity.Customer;

@Repository
class CustomerDaoJdbcImpl implements CustomerDao {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig .class);

	JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);

	@Override
	public List<Customer> ListAll() {
		String query="select * from mycustomers";
		try
		{
			List<Customer> custList=jt.query(query,new RowMapper<Customer>(){
				
				@Override
				public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

					return new Customer(rs.getInt(1), rs.getString(2), rs.getInt(3));
				}
				
			});
			return custList;
			
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Something went wrong");
		}	
		
	}
	@Override
	public Customer findById(int id) {
		String query="select * from mycustomers where CUSTID=?";
		try
		{
			
			 return jt.queryForObject(query, new Object[]{id}, (rs, rowNum) ->
	            new Customer(
	                    rs.getInt("customerId"),
	                    rs.getString("customerName"),
	                    rs.getInt("mobile")
	            ));
			
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Something went wrong");
		}	
		
	}
	
	@Override
	public boolean saveCustomer(Customer c) {
		// TODO Auto-generated method stub
		return false;
	}

}
