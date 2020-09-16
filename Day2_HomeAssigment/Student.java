
public class Student {
	int length;
	int breadth;
	
	public Student()
	{
		System.out.println("This is the default constructor");
	}
	public Student(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void getArea()
	{
		System.out.println("Area="+(length*breadth));
	}
	public static void main(String args[])
	{
		Student o1=new Student();
		Student o2=new Student(2,3);
		o2.getArea();
	}

}
