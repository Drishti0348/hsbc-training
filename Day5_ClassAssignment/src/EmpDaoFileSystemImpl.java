import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmpDaoFileSystemImpl implements EmpDao {
	
@Override
public String save(Emp e) {
	
	FileWriter fw=null;
	BufferedWriter bw=null;
	
	FileReader fr=null;
	BufferedReader br=null;
	
	try {
	
		
		fr=new FileReader("c:\\hsbc\\emp.txt");
		br=new BufferedReader(fr);
		
		String line="";
		while((line=br.readLine())!=null)
		{
			if(line.contains(""+e.getId()))
			{
				return "Emp already exist";
			}
		}
		
		fw=new FileWriter("c:\\hsbc\\emp.txt",true);
		bw=new BufferedWriter(fw);
		String empData=e.getId()+","+e.getName()+","+e.getCity()+","+e.getSalary();
		bw.write(empData);
		bw.flush();
		
		
	}catch(Exception ex)
	{
		System.out.println(ex);
		}
	
	finally {
		try {
			if(br!=null)
			{
				br.close();
			}
		}catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
	
	
	
	return "Details saved";
}

}
 