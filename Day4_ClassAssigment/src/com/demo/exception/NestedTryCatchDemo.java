package com.demo.exception;

public class NestedTryCatchDemo {
	public static void main(String[] args) {
		try {
			try {
				int a = 10;
				int b = 0;
				double d = a / b;

			}
			catch(NullPointerException e)//exception is not handled by inner catch
			{
				System.out.println(e);
			}
		}
		 catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("app resumes normally");
	}

}
