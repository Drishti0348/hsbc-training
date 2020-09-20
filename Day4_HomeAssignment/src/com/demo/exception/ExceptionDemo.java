package com.demo.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int d = 0;
		try {
			try {
				
				d = a / b;
				System.out.println("d=" + d);
				System.out.println("inside innner try");
				
			} catch (NullPointerException e) {
				System.out.println(e);
			}

		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("inside outer try");
	}
}
