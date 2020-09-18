package com.demo.abstract1;

public class BirdDemo {
	public static void main(String[] args) {
		Parrot p=new Parrot();
		Eagle e=new Eagle();
		Duck d=new Duck();
		
		System.out.println(p.name());
		System.out.println(e.name());
		System.out.println(d.name());
	}

}
