package com.demo.empInterface;

public class EmpDaoMockJdbcImpl implements EmpDao {
	
	@Override
	public int empFindById(int id) {
		return id;
	}
	@Override
	public void listAllEmp() {
		System.out.println("JDBC: Emp list");
		
	}
	@Override
	public String save(String e) {
		
		return "saved";
	}

}
