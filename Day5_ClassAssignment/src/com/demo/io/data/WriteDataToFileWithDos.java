package com.demo.io.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteDataToFileWithDos {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("c:\\hsbc\\mydata.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		
		dos.writeInt(100);
		dos.writeUTF("Drishti");
		dos.writeUTF("bbrs");
		dos.writeDouble(500.0);
		dos.close();
	}
	

}
