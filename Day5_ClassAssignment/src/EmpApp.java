                

public class EmpApp {
	public static void main(String[] args) {
		EmpDao dao= new EmpDaoFileSystemImpl();
		EmpService service=new EmpService(dao);
		
		String resp=service.registerEmp(127, "Scott","London",67000);
		System.out.println(resp);


}
}
