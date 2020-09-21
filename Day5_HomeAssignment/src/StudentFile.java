import java.io.FileWriter;
import java.io.BufferedWriter;

public class StudentFile {
	public static void main(String[] args) throws Exception {
		Student s[]=new Student[10];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student(i,"Student"+i,"Branch"+i);
		}
		
		FileWriter fw=new FileWriter("c:\\hsbc\\data.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		String data="";
		for(int i=0;i<s.length;i++)
		{
			data=s[i].getId()+" "+s[i].getName()+" "+s[i].getBranch();
			bw.write(data);
		}
		System.out.println("details entered in file");
		bw.close();
		
		
	}

}
