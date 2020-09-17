package com.demo.interfaces;
import com.demo.impl.mysql.MySqlDB;
import com.demo.impl.oracle.OracleDB;
//this class is used to create an object for the class hence loosening the dependency on class(loose coupling)
public class MyConFactory {
	public static MyConnection getMyConnection(String dbname)
	{
		if(dbname.equals("oracle"))
		{
			return new OracleDB();
		}
		else if(dbname.equals("mysql"))
		{
			return new MySqlDB();
		}
		else
			return null;//not to be practically done
	}

}
