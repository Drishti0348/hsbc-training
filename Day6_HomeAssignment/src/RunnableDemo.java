
public class RunnableDemo {
	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("main thread starts");
		
		MyThreadRunnable r=new MyThreadRunnable();
		Thread t=new Thread(r);
		t.start();
		t.join();
		System.out.println("main thread ends");
	}

}
