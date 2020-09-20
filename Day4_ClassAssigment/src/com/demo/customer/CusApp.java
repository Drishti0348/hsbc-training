package com.demo.customer;

public class CusApp {

	public static void main(String[] args) {

		CusDaoImpl dao = new CusDaoImpl();
		CusService cs = new CusService(dao);
		System.out.println(cs.registerDetails(10, "dris"));

	}

}
