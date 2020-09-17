package com.demo.inheritance3;

public class MainApp {

	public static void main(String[] args) {

		Figure ref;

		Triangle t = new Triangle(10, 20);
		ref = t;
		System.out.println(ref.area());

		Square s = new Square(20, 30);
		ref = s;
		System.out.println(ref.area());

		// run time reference, JVM does it while runtime

	}

}
