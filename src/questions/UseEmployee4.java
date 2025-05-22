package questions;

public class UseEmployee4 {
	public static void main (String[]args) {
		Employee4 e = new Employee4();
		e.setid(1620);
		e.setname("vikram");
		e.setdepartment("Mech");
		e.setage(24);
		e.setsalary(40000);
		e.setrole("Devalaper");
		
		System.out.println(e.getid()+", "+e.getname()+", "+e.getdepartment()+", "+e.getage()+", "+e.getsalary()+", "+e.getrole());
	}

}
class Employee4 {
	private int id;
	private String name;
	private String department;
	private int age;
	private int salary; 
	private String role;
	
	public void setid(int id) {
		this.id=id;
	}
	public int getid () {
		return id;
	}
	public void setname(String n) {
		name=n;
	}
	public String getname() {
		return  name;
	}
	public void setdepartment(String d) {
		department=d;
	}
	public String getdepartment() {
		return department;
	}
	public void setage(int a) {
		age=a;
	}
	public int getage() {
		return age;
	}
	public void setsalary(int s) {
		salary=s;
	}
	public int getsalary() {
		return salary;
	}
	public void setrole(String r) {
		role=r;
	}
	public String getrole() {
		return role;
	}
}
	
