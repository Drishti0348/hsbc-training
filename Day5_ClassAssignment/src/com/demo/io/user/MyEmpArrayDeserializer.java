package com.demo.io.user;
import com.demo.io.entity.Emp;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyEmpArrayDeserializer  {
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis=new FileInputStream("emp2.ser");
		ObjectInputStream objIn=new ObjectInputStream(fis);
		
		try
		{
			while(true)
			{
				Emp empList[]=(Emp[])objIn.readObject();
				
				for(Emp e:empList)
					
				System.out.println(e.getId()+" "+e.getName()+" "+e.getCity()+" "+e.getSalary());
			}
		}catch(EOFException e)
		{
			System.out.println("Done");
		}
		
		

	}
	
}
