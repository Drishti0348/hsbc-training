package com.demo.interfaces.app;

import com.demo.interfaces.MyConFactory;
import com.demo.interfaces.MyConnection;

import com.demo.impl.oracle.OracleDB;

import com.demo.impl.mysql.MySqlDB;

public class MainApp {
	public static void main(String[] args) {
		MyConnection con=new OracleDB();
		MyConnection con1=new MySqlDB();
		MyConnection con2 =MyConFactory.getMyConnection("sql");
		
		System.out.println(MyConnection.releasever);
		System.out.println(con2.getDBDetails());
		System.out.println(con2.getConnectionInfo());
		
	}

}
