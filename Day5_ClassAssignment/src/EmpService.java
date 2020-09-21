

public class EmpService {
	EmpDao dao;
	public EmpService(EmpDao dao) {
		
		this.dao=dao;
	}
		public String registerEmp(int id,String name,String city,double salary)
		{
				Emp e=new Emp(id,name,city,salary);
				String info=dao.save(e);
				return info;
				
			
		}

	

}
