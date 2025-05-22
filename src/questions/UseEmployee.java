package questions;

public class UseEmployee {
	public static void main (String[]args) {
		Employee e1 = new Employee();
		e1.id = 1620;
		e1.name="Vikram S";
		e1.department="Mechanical";
		e1.age=24;
		e1.salary=40000;
		e1.role="Develaper";
		System.out.println(e1.id+", "+e1.name+", "+e1.department+", "+e1.age+", "+e1.salary+", "+e1.role);
		Employee e2 = new Employee();
		e2.id=1234;
		e2.name="vik";
		e2.department="mech";
		e2.age=25;
		e2.salary=45000;
		e2.role="Design";
		System.out.println(e2.id+", "+e2.name+", "+e2.department+", "+e2.age+", "+e2.salary+", "+e2.role);
	}

}
class Employee {
	int id;
	String name;
	String department;
	int age;
	int salary; 
	String role;
	
}