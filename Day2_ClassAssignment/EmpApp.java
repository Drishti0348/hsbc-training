
public class EmpApp {
	
	
	Emp empList[]=new Emp[10];
	
	/*public EmpApp()
	{
		empList[0].Emp(1,"dris");
		empList[1].Emp(2,"tek");
	}*/
	
	void empDetails()
	{
		for(int i=0;i<empList.length;i++)
		{
			if(empList[i]!=null)
				empList[i].showData();
		}
	}
	
	void empSearch(int id)
	{
	
		for(int i=0;i<empList.length;i++)
		{
			if(empList[i].getEmpId()==id)
			empList[i].showData();
			else
			System.out.println("not found");
		}
	}
	
	public String addEmp(Emp e)
	{
		String msg="";
		for(int i=0;i<empList.length;i++)
		{
			if(empList[i]==null)
			{
				empList[i]=e;
				msg="emp added";
				break;
			}
			else
			msg="DB full";
			
		}
		return msg;
		
	}

	public static void main(String[] args) {
		
		
		
		EmpApp ap=new EmpApp();
		Emp e=new Emp(101,"amri");
		System.out.println(ap.addEmp(e));
		ap.empSearch(101);
		
		
		
		
		
		
	}

}
