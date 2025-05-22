package oops2;

public class UseInstitute {
	public static void main (String[]args) {
		Institute i = new Institute();
		i.Name="OneSoft";
		i.corce="JAVA";
		i.openingYear=2000;
		
		Employee e = new Employee();
		e.name="Vikram";
		e.gender="male";
		e.age=24;
		
		Engineer g = new Engineer();
		g.Qualification="Mecanical";
		g.exprince=2;
		g.salary=45000;
		
		System.out.println(e.name+", "+e.gender+", "+e.age+", "+i.Name+", "+i.corce+", "+i.openingYear+", "+g.Qualification+","+g.exprince+", "+g.salary);
		
	}
         // Multi Level Inherritance
}
class Institute {
	String Name;
	String corce;
	int openingYear;
}
class Employee extends Institute {
	String name;
	String gender;
	int age;
}
class Engineer extends Employee {
	String Qualification;
	int exprince;
	int salary;
}