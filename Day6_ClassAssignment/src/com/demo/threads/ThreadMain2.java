package com.demo.threads;

public class ThreadMain2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread starts");
		
		Worker w= new Worker();
		Thread t=new Thread(w);
		t.start();
		
		t.join();
		System.out.println("main thread ends");

	}

}
