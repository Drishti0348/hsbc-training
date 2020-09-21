import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class FileCopy {

	public static void main(String[] args) throws Exception{
		
		FileReader fr=new FileReader("c:\\hsbc\\data1.txt");
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter("c:\\hsbc\\copy.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		String line="";
		while((line=br.readLine())!=null)
		{
			bw.write(line);
		}
		br.close();
		bw.close();
		System.out.println("program end");
		

	}

}
