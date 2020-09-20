package com.demo.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {
	public static void main(String[] args) {
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		
		try {
			File f=new File("C:\\hsbc\\abc.txt");
			 fis=new FileInputStream(f);
			 fos=new FileOutputStream("C:\\hsbc\\xyz.txt");
			int data=0;
			while((data=fis.read())!=-1)
			{
				System.out.println((char)data);
				fos.write(data);
			}
			
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("finally");
			try {
			if(fis!=null || fos!=null)
			{
				fis.close();
				fos.close();
			}
				}
			catch(IOException e)
			{
				System.out.println("Stream could not be found"+e);
			}
		}
		System.out.println("program end");
	}

}
