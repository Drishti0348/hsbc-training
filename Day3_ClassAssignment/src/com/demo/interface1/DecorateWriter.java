package com.demo.interface1;

public class DecorateWriter implements Writer {
	@Override
	public void write(String message) {
		System.out.println("This is decorated text");
	}
	
}
	
