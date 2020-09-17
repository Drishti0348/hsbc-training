package com.demo.inheritance;

public class App {
	public static void main(String args[])
	{
		Person p=new Person(100,"Dris");
		Employee e=new Employee(200,"Tek",400.0);
		TraineeEmp te=new TraineeEmp(300,"Amri",500.0,"good");
		System.out.println(p.getDetails());
		System.out.println(e.getDetails());
		System.out.println(te.getDetails());
		
	}

}
