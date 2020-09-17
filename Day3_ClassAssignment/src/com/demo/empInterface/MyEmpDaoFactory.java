package com.demo.empInterface;

public class MyEmpDaoFactory {
	public static EmpDao getEmpDaoObj(String dbname)
	{
		if(dbname.equals("JDBC"))
		return new EmpDaoMockJdbcImpl();
		
		else if(dbname.equals("hibernate"))
			return new EmpDaoMockHibernateImpl();
		else
			return null;
	}
	
}
