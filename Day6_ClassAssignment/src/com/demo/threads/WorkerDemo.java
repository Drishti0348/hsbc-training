package com.demo.threads;

public class WorkerDemo {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("main thread starts");
		
		MessagePrinter mp=new MessagePrinter();
		Thread t1=new Thread(new WorkerThread(mp,"dris"));
		Thread t2=new Thread(new WorkerThread(mp,"tek"));
		Thread t3=new Thread(new WorkerThread(mp,"hello"));
		//3 threads are created using one shared object
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		
		
		System.out.print("main thread ends");
		
		
		
	}

}
