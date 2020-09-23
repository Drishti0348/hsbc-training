package com.hsbc.training.collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		//HashSet<String> names=new HashSet<String>();
		TreeSet<String> names=new TreeSet<String>();
		names.add("dris");
		names.add("tek");
		names.add("amri");
		names.add("aman");
		names.add("priya");
		names.add("rajni");
		names.add("dhanush");
		names.add("arti");
		System.out.println(names.contains("dris"));
		names.remove("dhanush");
		names.add("ratan");
		System.out.println(names);
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			String name=itr.next();
			name="Hi "+name;
			System.out.println(name);
		}
		
		

	}

}
