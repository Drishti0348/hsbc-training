package com.demo.io.user;
import com.demo.io.entity.Emp;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MyEmpSerializer {
	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos=new FileOutputStream("emp.ser");
		ObjectOutputStream obOut=new ObjectOutputStream(fos);
		
		for(int i=0;i<10;i++)
		{
			Emp emp=new Emp(100+i,"Emp"+i,"city"+i,5000+i);
			
			obOut.writeObject(emp);
		}
		obOut.close();
		
		System.out.println("Emp Serialized");
		
	}

}
