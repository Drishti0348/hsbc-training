package com.demo.customer;

public class CusService {
	CusDao dao;
	public CusService(CusDao dao) {
		// TODO Auto-generated constructor stub
		this.dao=dao;
	}
	public String registerDetails(int id,String name)
	{
		Cus c=new Cus(id,name);
		return dao.save(c);
	}
	

}
