import java.io.Serializable;

public class Emp implements Serializable {
	int id;
	String name;
	String city;
	double salary;
	public Emp(int id,String name,String city,double salary) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.city=city;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}