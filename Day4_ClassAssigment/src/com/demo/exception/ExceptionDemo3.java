package com.demo.exception;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		int num[]= {1,2,3,4};
		System.out.println("start program");
		try
		{
			System.out.println(num[4]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		System.out.println("end program");
	}

}
