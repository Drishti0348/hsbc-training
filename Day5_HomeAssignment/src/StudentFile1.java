import java.io.BufferedReader;
import java.io.FileReader;


public class StudentFile1 {
	public static void main(String[] args) throws Exception{
		
		Student s[]=new Student[10];
		FileReader fr=new FileReader("c:\\hsbc\\studData.txt");
		BufferedReader br=new BufferedReader(fr);
		String line="";
		int i=0;
		while((line=br.readLine())!=null)
		{
			String cols[]=line.split(",");
			int id=Integer.parseInt(cols[0]);
			s[i]=new Student(id,cols[1],cols[2]);
			i++;
		}
		for(i=0;i<s.length;i++)
		{
			if(s[i]!=null)
			{
				System.out.println(s[i].getId()+" "+s[i].getName()+" "+s[i].getBranch());
			}
		}
		System.out.println("program end");
		br.close();
	}
	

}
