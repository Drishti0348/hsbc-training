package com.demo.inheritance;

public class App2 {
	public static void main(String args[])
	{
		
		Person p=new Person(100,"Dris");
		Employee e=new Employee(200,"Tek",400.0);
		TraineeEmp te=new TraineeEmp(300,"Amri",500.0,"good");
		
		Person p2=new Employee(103,"scott",8900);
		
		System.out.println(p.getDetails());
		System.out.println(e.getDetails());
		System.out.println(te.getDetails());
		
		//fun can't be called since it is an external method
		
		System.out.println(p2.getDetails());
		
		//Object o=e;
		Person p1=e; //super class reference to sub class object
		System.out.println(p1.getClass().getName());
		
		System.out.println(e);

		
		
	}

}
