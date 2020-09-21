import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class CustomerSerializer {

	public static void main(String[] args) throws Exception {
		Customer c[]=new Customer[3];
		FileOutputStream fos=new FileOutputStream("customers.ser");
		ObjectOutputStream obOut=new ObjectOutputStream(fos);
		
		for(int i=0;i<3;i++)
		{
			c[i]=new Customer(100+i,"customer"+i,"city"+i);
			
			
		}
		obOut.writeObject(c);
		obOut.close();
		
		System.out.println("Customers Serialized");
		
	}
}
