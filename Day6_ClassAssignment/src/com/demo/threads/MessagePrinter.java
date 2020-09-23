package com.demo.threads;

public class MessagePrinter {
	
	public synchronized void print(String message)
	{
		System.out.print("["+message);
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("]");
	}

}
