package com.demo.exception;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			Object ref=null;
			ref.toString();
			
		}
		catch(NullPointerException e)
		{
			throw new UserDefinedException();
		}
	}

}
