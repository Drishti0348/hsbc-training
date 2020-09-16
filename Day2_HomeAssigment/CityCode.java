import java.util.Scanner;

public class CityCode {
	public String getCityByCode(int code)
	{
		if(code==1)
			return "DELHI";
		else if(code==2)
			return "NOIDA";
		else if(code==3)
			return "GURGAON";
		else if(code==4)
			return "BANGALORE";
		else
			return "INVALIDCODE";
	}
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in); 
		 int x = sc.nextInt();
		CityCode c=new CityCode();
		System.out.println(c.getCityByCode(x));
	}

}
