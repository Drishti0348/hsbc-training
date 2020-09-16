package employeeCalculator;

public class Employee {
	
	MyCalculator m=new MyCalculator();
	int ctc;
	int pf;
	int gratuity;
	
	public Employee(int ctc,int pf,int gratuity)
	{
		this.ctc=ctc;
		this.pf=pf;
		this.gratuity=gratuity;
	}
	
	public int getCtc() {
		return ctc;
	}



	public int getSalary()
	{
		return m.getSubtract(ctc,m.getAdd(pf,gratuity));
	}

}
