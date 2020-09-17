package com.demo.impl.mysql;

import com.demo.interfaces.MyConnection;

public class MySqlDB implements MyConnection {
	@Override
	public String getConnectionInfo() {
		
		return "connection established successfullly";
	}

	@Override
	public String getDBDetails() {
		// TODO Auto-generated method stub
		return "My SQL DB 8.3";
	}
}
