package com.demo.threads;

public class ThreadMain1 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main thread starts");
		Thread.currentThread().setPriority(9);
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());
		
		t2.join();
		t2.join();
		System.out.println("main thread exits");
		

	}

}
