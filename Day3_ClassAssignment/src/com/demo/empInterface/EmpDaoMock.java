package com.demo.empInterface;

public class EmpDaoMock {

	public static void main(String[] args) {
		EmpDao m=MyEmpDaoFactory.getEmpDaoObj("JDBC");
		m.listAllEmp();
		
		EmpDao m1=MyEmpDaoFactory.getEmpDaoObj("hibernate");
		m1.listAllEmp();
		

	}

}
