package org.demo.client;

import org.demo.tools.Calculator;

public class MathTester {
	public static void main(String[] args) {

		Calculator c = new Calculator(40, 30);
		
		System.out.println("addition=" + c.add());

		System.out.println("subtraction=" + c.subtract());
		
		System.out.println("multiplication=" + c.multiply());
	}
}
