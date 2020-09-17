package com.demo.empInterface;

public class EmpDaoMockHibernateImpl implements EmpDao {

	@Override
	public int empFindById(int id) {
		return id;
	}

	@Override
	public void listAllEmp() {
		System.out.println("Hibernate: Emp List");

	}

	@Override
	public String save(String e) {

		return "saved";
	}

}
