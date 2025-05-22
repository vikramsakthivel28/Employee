package questions;

public class UseEmployee2 {
	public static void main (String[]args) {
		Employee2 m = new Employee2(1620,"Vikram","Mech",24,40000,"devalaper");
		System.out.println(m.showEmployee()+", "+m);
	}

}
class Employee2 {
	int id;
	String name;
	String department;
	int age;
	int salary; 
	String role;
	public Employee2(int id, String name, String department, int age, int salary, String role) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.age=age;
		this.salary=salary;
		this.role=role;
	}
	public String toString() {
		return " ID:"+id+", NAME:"+name+", DEPE:"+department+", AGE:"+age+", SALARY:"+salary+", ROLE:"+role;
	}
	public String showEmployee () {
		return "SHOW";
	}
}