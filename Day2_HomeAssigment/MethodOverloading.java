
public class MethodOverloading {
	public int add(int number1,int number2)
	{
		return number1+number2;
	}
	public double add(int number1,double number2)
	{
		return number1+number2;
	}
	public double add(double number1,double number2)
	{
		return number1+number2;
	}
	
	public static void main(String args[])
	{
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.add(2,3));
		System.out.println(m.add(2.0,3));
		System.out.println(m.add(2.0,3.0));
		
	}

}
