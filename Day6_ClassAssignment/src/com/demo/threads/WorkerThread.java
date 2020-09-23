package com.demo.threads;

public class WorkerThread implements Runnable{
	private String message;
	private MessagePrinter mp;
	
	public WorkerThread(MessagePrinter mp,String message) {
		this.mp=mp;
		this.message=message;
	}
	
	@Override
	public void run() {
	mp.print(message);
		
	}

}
