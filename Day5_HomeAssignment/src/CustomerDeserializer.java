import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CustomerDeserializer {
	public static void main(String[] args) throws Exception{
			
			FileInputStream fis=new FileInputStream("Customers.ser");
			ObjectInputStream objIn=new ObjectInputStream(fis);
			
			try
			{
				while(true)
				{
					Customer cusList[]=(Customer[])objIn.readObject();
					
					for(Customer c:cusList)
						
					System.out.println(c.getId()+" "+c.getName()+" "+c.getAddress());
				}
			}catch(EOFException e)
			{
				System.out.println("Done");
			}
			objIn.close();
	}

}
