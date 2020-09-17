package employeeCalculator;

public class IncomeTaxDeductions {
	public int getTaxAmount(Employee e)
	{
		return 12*e.getCtc()/100;
	}
	public static void main(String args[])
	{
		IncomeTaxDeductions it=new IncomeTaxDeductions();
		Employee e=new Employee(10000,600,400);
		System.out.println("salary="+e.getSalary());
		System.out.println("IncomeTaxDeduction="+it.getTaxAmount(e));
	}

}
