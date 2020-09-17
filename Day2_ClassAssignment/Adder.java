import java.io;
public class Adder {
	public static void main(String args[])
	{
	
		int sum=0,x;
		if(args.length<2)
			System.out.println("input atleast two no");
		else
		{
			for(int i=0;i<args.length;i++)
			{
				x=Integer.parseInt(args[i]);
				sum=sum+x;
				
			}		
			
		}
		if(sum!=0)
		System.out.println("sum "+sum);
	}

}
