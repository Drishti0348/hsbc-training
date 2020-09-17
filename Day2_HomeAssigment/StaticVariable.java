
public class StaticVariable {
	public static int number=0;
	public static void main(String args[])
	{
		System.out.println("number="+StaticVariable.number);
		StaticVariable sv=new StaticVariable();
		System.out.println("number="+sv.number);//ordinary way
	}

}
