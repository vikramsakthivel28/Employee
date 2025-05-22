package oops1;

public class UseCompany {
	public static void main (String[]args) {
		Employee e1 = new Employee("VIKRAM",1620,24);
		System.out.println(e1);
		
		Company c = new Company("ONESOFT",2025,e1);
		System.out.println(c);
		
		c.setName("ASHOK LEYLANT");
		c.setyear(2023);
		System.out.println(c);
		
		e1.setname("VASANTH");
		System.out.println(e1);
		
		
		System.out.println(c);
		
		c.setName("MAHANDHIRA");
		c.setyear(2020);
		System.out.println(c);
		
		c.setEmployee(e1);
	}
} 
class Employee {
	private String name;
	private int id;
	private int age;
	public void setname (String name) {
		this.name=name;
	}
	public void setid (int id) {
		this.id=id;
	}
	public void setage (int age) {
		this.age=age;
	}
	
	public String getname () {
		return name;
	}
	public int getid () {
		return id;
	}
	public int getage () {
		return age;
	}
	public Employee (String name, int id, int age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public String toString() {
		return "NAME:"+name+", "+"ID:"+id+", "+"AGE:"+age;
	}
}
class Company {
	private String Name;
	private int year;
	private Employee e;
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setyear(int year) {
		this.year=year;
	}
	public void setEmployee(Employee e) {
		this.e=e;
	}
	public Company (String Name, int year, Employee e) {
		this.Name=Name;
		this.year=year;
		this.e=e;
	}
	public String toString() {
		return "Name:"+Name+", "+"YEAR:"+year+" = "+"EMPLOYEE:"+e;
	}
	
}