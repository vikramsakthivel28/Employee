package oops2;

public class UseHuman1 {
	public static void main (String[]args) {
		Human1 h = new Human1("Vikram","male",24);
		System.out.println(h);
		
		Teacher1 t = new Teacher1("Vikram","male",24,"mechanical",2.5f,4500);
		System.out.println(t);
	}
        // Singl Level inherritance to Encaplition
}
class Human1 {
	private String name;
	private String gender;
	private int age;
	public Human1 (String name, String gender, int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public String toString() {
		return name+", "+gender+", "+age;
	}
	// set
	public void setname(String n) {
		name = n;
	}
	public void setgender(String g) {
		gender=g;
	}
	public void setage(int a) {
		age=a;
	}
	// get
	public String getname() {
		return name;
	}
	public String getgender() {
		return gender;
	}
	public int getage() {
		return age;
	}
}
class Teacher1 extends Human1 {
	private String qualification;
	private float expriance;
	private int salary;
	public Teacher1 (String name, String gender, int age,String qualification, float expriance, int salary) {
		super(name,gender,age);
		this.qualification=qualification;
		this.expriance=expriance;
		this.salary=salary;
	}
	public String toString() {
		return super.toString()+", "+qualification+", "+expriance+", "+salary;
	}
	
	// set
	public void setqualification(String q) {
		qualification = q;
	}
	public void setexpriance(float e) {
		expriance=e;
	}
	public void setsalary(int s) {
		salary=s;
	}
	// get
	public String getqualification() {
		return qualification;
	}
	public float getexpriance() {
		return expriance;
	}
	public int getsalary() {
		return salary;
	}
}