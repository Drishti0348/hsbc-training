
public class MyThreadRunnable implements Runnable{
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println("hello");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}

}
