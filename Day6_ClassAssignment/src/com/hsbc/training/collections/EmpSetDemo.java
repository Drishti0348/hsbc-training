package com.hsbc.training.collections;
import com.demo.io.entity.Emp;

import java.util.HashSet;
import java.util.Iterator;

public class EmpSetDemo {

	public static void main(String[] args) {
		
		Emp empList[]=new Emp[5];
		for(int i=0;i<empList.length;i++)
		{
			empList[i]=new Emp(i,"Emp"+i,"city"+i,1000+i);
		}
		
		HashSet<Emp> emp=new HashSet<Emp>();
		for(int i=0;i<empList.length;i++)
			emp.add(empList[i]);
		
		System.out.println(emp);
		Iterator<Emp> itr=emp.iterator();
		while(itr.hasNext())
		{
			String details=itr.next().getName();
			System.out.println(details);
		}
		
		System.out.println(emp.contains(empList[0]));
		
		Emp e=new Emp(0,"Emp0","city0",1000);
		
		//Object o=new Object();
		System.out.println(emp.contains(e));
		
		
		
		
		
		

	}

}
