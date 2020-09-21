package com.demo.io.user;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.Emp;
import com.demo.io.entity.EmpWrapper;

public class MyEmpArraySerializer  {
 
	public static void main(String[] args) throws Exception {
		
		Emp[] empList=new Emp[10];
		
		FileOutputStream fos=new FileOutputStream("emp2.ser");
		ObjectOutputStream obOut=new ObjectOutputStream(fos);
		
		for(int i=0;i<10;i++)
		{
			empList[i]=new Emp(100+i,"Emp"+i,"city"+i,5000+i);
			
			
		}
		obOut.writeObject(empList);
		obOut.close();
		
		System.out.println("Emp Serialized");
	}
}
