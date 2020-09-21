package com.demo.io.data;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.EOFException;


public class ReadDataFromFileWithDis {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("c:\\hsbc\\mydata.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			DataInputStream dis=new DataInputStream(bis);
			while(true)
			{
				int id=dis.readInt();
				String name=dis.readUTF();
				String city=dis.readUTF();
				double salary=dis.readDouble(); 
				System.out.println(id+" "+name+" "+city+" "+salary);
				
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
