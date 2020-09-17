package com.demo.impl.oracle;

import com.demo.interfaces.MyConnection;

public class OracleDB implements MyConnection {
	
	@Override
	public String getConnectionInfo() {

		return "connection is established";
	}

	@Override
	public String getDBDetails() {

		return "oracle DB 13C";
	}

}
