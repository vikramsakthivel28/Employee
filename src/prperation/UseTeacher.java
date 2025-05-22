package prperation;

public class UseTeacher {
	public static void main (String[]args) {
		Employee e = new Employee("onesoft",2020,"vikram",24);
		System.out.println(e);
		Teacher t = new Teacher("onesoft",2020,"English",20000);
		System.out.println(t);
	}

}
class Institute {
	private String name;
	private int year;
	public Institute(String name, int year) {
		this.name=name;
		this.year=year;
	}
	public String toString() {
		return name+", "+year;
	}
	public void setname(String n) {
		name=n;
	}
	public void setyear(int y) {
		year=y;
	}
	public String getname() {
		return name;
	}
	public int getyear() {
		return year;
	}
}
class Employee extends Institute {
	private String eName;
	private int age;
	public Employee(String name, int year, String eName, int age) {
		super(name,year);
		this.eName=eName;
		this.age=age;
	}
	public String toString() {
		return super.toString()+", "+eName+", "+age;
		}
	public void seteName(String eName) {
		this.eName=eName;
	}
	public void setage(int age) {
		this.age=age;
	}
	public String geteName() {
		return eName;
	}
	public int getage() {
		return age;
	}
}
class Teacher extends Institute {
	private String subject;
	private int salary;
	public Teacher(String name, int year, String subject, int salary) {
		super(name,year);
		this.subject=subject;
		this.salary=salary;
	}
	public String toString() {
		return super.toString()+", "+subject+", "+salary;
	}
	public void setsubject(String s) {
		subject=s;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public String getsubject() {
		return subject;
	}
	public int getsalary() {
		return salary;
	}
}


