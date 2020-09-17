
public class BoxDemo {
	
	public static void main(String args[])
	{
		Box b1=new Box(10,20,30);
		System.out.println("volume="+b1.getVolume());
		Box b2=new Box(b1,"Blue");
		System.out.println("color="+b2.getColor());
		Box b3=new Box(10,20,30,"Blue",50.0);
		System.out.println("volume="+b3.getVolume()+" color="+b3.getColor());
	}

}
