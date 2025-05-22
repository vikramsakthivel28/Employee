package oops2;

public class UseInstitute1 {
	public static void main (String[]args) {
		Engineer1 e = new Engineer1("OneSoft","JAVA",2000,"Vikram","male",24,"mech",2,35000);
		System.out.println(e);
	}
}

       // Multi Level Inherritance to using Encaplition  

class Institute1 {
	private String Name;
	private	String corce;
	private int openingYear;
	public Institute1 (String name, String corce, int openingYear) {
		this.Name=name;
		this.corce=corce;
		this.openingYear=openingYear;
	}
	public String toString() {
		return Name+", "+corce+", "+openingYear;
	}
}
class Employee1 extends Institute1 {
	private String name;
	private String gender;
	private int age;
	public Employee1 (String Name, String corce, int openingYear, String name, String gender, int age) {
		super(Name, corce, openingYear);
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public String toString () {
		return super.toString()+", "+name+", "+gender+", "+age;
	}
}
class Engineer1 extends Employee1 {
	private String Qualification;
	private int exprince;
	private int salary;
	public Engineer1 (String Name, String corce, int openingYear, String name, String gender, int age, String Qualification, int exprince, int salary) {
		super(Name,corce,openingYear,name,gender,age);
		this.Qualification=Qualification;
		this.exprince=exprince;
		this.salary=salary;
	}
	public String toString () {
		return super.toString()+", "+Qualification+", "+exprince+", "+salary;
		
	}
}
 