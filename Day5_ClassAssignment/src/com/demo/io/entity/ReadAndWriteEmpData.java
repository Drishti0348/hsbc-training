package com.demo.io.entity;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndWriteEmpData {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader("c:\\hsbc\\emp.txt");
			br=new BufferedReader(fr);
			String line="";
			while((line=br.readLine())!=null)
			{
				
				System.out.println(line);
				String cols[]=line.split(",");
				int id=Integer.parseInt(cols[0]);
				double salary=Double.parseDouble(cols[3]);
				Emp e=new Emp(id,cols[1],cols[2],salary);
				System.out.println(id+" "+e.getName()+" "+e.getCity()+" "+salary);
			}
			
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}catch(EOFException e)
		{
			System.out.println("done reading");
			
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
