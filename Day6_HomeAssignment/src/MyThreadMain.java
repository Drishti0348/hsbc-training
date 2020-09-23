
public class MyThreadMain {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("main thread starts");
		
		MyThread t1=new MyThread();
		
		t1.start();
		
		t1.join();
		System.out.println("main thread ends");

	}

}
