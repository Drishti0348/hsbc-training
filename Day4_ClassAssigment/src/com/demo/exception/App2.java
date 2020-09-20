package com.demo.exception;

public class App2 {
	
	public int divide(int a, int b) {
		int d=0;
		try {
			d = a / b;
		} catch (ArithmeticException e) {
			throw new RuntimeException("something went wrong");
			//throw e;
		}
		return d;
	}

}
