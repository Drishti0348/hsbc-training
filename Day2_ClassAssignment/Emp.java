
public class Emp {
	private int empId;
	private String empName;
	public Emp(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	void showData()
	{
		 System.out.println(empId+" "+empName);
	}
	public int getEmpId() {
		return empId;
	}
	
	

}
