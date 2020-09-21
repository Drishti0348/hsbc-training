package com.demo.io.user;
import com.demo.io.entity.Emp;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyEmpDeserializer  {
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis=new FileInputStream("emp.ser");
		ObjectInputStream objIn=new ObjectInputStream(fis);//objIn contains the stream of Emp obj
		
		try
		{
			while(true)
			{
				Object obj=objIn.readObject();//it is deserialized here
				//System.out.println(obj.getClass().getName());
				
				Emp e=(Emp)obj;//typecasted to emp type object
				System.out.println(e.getId()+" "+e.getName()+" "+e.getCity()+" "+e.getSalary());
			}
		}catch(EOFException e)
		{
			System.out.println("Done");
		}
		
		

	}
	
}
