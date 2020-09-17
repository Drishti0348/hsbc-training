package com.demo.interface1;
import com.demo.interface1.Writer;

public class PlainTextWriter implements Writer{
	@Override
	public void write(String message) {
		System.out.println(message);
		
	}
	

}
