package com.demo.exception;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("Stsrt a program");
		try
		{
			int a=10;
			int b=0;
			double d=a/b;
			System.out.println("no exception in try block");
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("end a program");
	}

}
