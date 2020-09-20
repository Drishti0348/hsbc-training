package com.demo.exception;

public class App1 {
	
	public int calculate(int a,int b)
	{
		App2 a2=new App2();
		try {
			return a2.divide(a,b);
		}catch(RuntimeException e)
		{
			throw e;
		}
	}

}
