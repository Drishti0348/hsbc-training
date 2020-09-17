package loan;

public class LoanDemo {
	public static void main(String[] args) {
		PersonalLoan p=new PersonalLoan();
		HomeLoan h=new HomeLoan();
		
		p.setLoanAmount(200.0);
		p.setMonths(4);
		p.setPercentage(5.0f);
		p.setPerson("Dris");
		System.out.println("Name="+p.getPerson()+" Amount="+p.getLoanAmount()+" Percentage="+p.getPercentage()+" Month="+p.getMonths());
		
		h.setLoanAmount(400.0);
		h.setMonths(5);
		h.setPercentage(7.0f);
		h.setPerson("Tek");
		System.out.println("Name="+h.getPerson()+" Amount="+h.getLoanAmount()+" Percentage="+h.getPercentage()+" Month="+h.getMonths());
		
	}

}
