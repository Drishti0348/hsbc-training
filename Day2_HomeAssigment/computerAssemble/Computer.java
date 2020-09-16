package computerAssemble;

public class Computer {
	public double getComputerPrice(Monitor m,Keyboard k,Mouse mo,CPU cp)
	{
		return m.getMonitorPrice()+k.getKeyboardPrice()+mo.getMousePrice()+cp.getCpuPrice();
	}
	
	public Computer()
	{
		
	}
	public static void main(String args[])
	{
		Computer c=new Computer();
		Monitor m=new Monitor();
		m.setMonitorPrice(5000.0);
		Keyboard k=new Keyboard();
		k.setKeyboardPrice(1000.0);
		Mouse mo=new Mouse();
		mo.setMousePrice(500.0);
		CPU cp=new CPU();
		cp.setCpuPrice(10000.0);
		System.out.println("Computer Price="+c.getComputerPrice(m,k,mo,cp));
		
	}

}
