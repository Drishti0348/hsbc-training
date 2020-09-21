import java.io.BufferedReader;
import java.io.FileReader;

public class CountWordFile {
	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("c:\\hsbc\\info.txt");
		BufferedReader br=new BufferedReader(fr);
		String line="";
		int words=0;
		int i=0;
		while((line=br.readLine())!=null)
		{
			String cols[]=line.split(" ");
			words=words+cols.length;
			i++;
		}
		System.out.println("words:"+words+" sentences:"+i);
		br.close();
	}

}
