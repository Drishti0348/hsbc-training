
public class Box {

	 private int length;
	 private int breadth;
	 private int height;
	 private String color="not a color";
	 private double weight;
	 
	public Box(int length,int breadth,int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public Box(Box o,String color)
	{
		this.color=color;
	}
	public Box(int length,int breadth,int height,String color,double weight)
	{
		this(length,breadth,height);
		this.color=color;
		this.weight=weight;
	}
	
	public int getVolume()
	{
		return length*breadth*height;
	}
	public String getColor()
	{
		return color;
	}
	public double getWeight()
	{
		return weight;
	}
	
}
