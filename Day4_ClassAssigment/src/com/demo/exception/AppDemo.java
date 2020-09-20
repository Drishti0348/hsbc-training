package com.demo.exception;

public class AppDemo {
	public static void main(String[] args) {
		App1 a1=new App1();
		
		
		try {
			System.out.println(a1.calculate(2,2));
			System.out.println(a1.calculate(2,0));
		}
		catch(RuntimeException e)
		{
			System.out.println(e);
		}
		System.out.println("done");
	}

}
