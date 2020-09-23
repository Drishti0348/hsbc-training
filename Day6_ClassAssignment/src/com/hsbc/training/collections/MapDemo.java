package com.hsbc.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class MapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, String> sc=new HashMap<String,String>();
		sc.put("Bengal","Kolkata");
		sc.put("Jharkhand","Ranchi");
		sc.put("Bihar","Patna");
		
		
		System.out.println(sc);
		
		System.out.println(sc.get("Jharkhand"));
		
		Set<String> ks=sc.keySet();
		
		Iterator<String> itr=ks.iterator();
		
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println("key:"+sc.get(key));
			
		}
		
	}

}
