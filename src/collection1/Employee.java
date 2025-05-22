package collection1;

public class Employee {
private int id;
private String name;
private String gender;
private int salary;
private boolean isDeveloper;
private String role;
public Employee(int id, String name, String gender, int salary, boolean isDeveloper, String role) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.salary = salary;
	this.isDeveloper = isDeveloper;
	this.role = role;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", isDeveloper="
			+ isDeveloper + ", role=" + role + "]";
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public boolean getisDeveloper() {
	return isDeveloper;
}
public void setDeveloper(boolean isDeveloper) {
	this.isDeveloper = isDeveloper;
}



		
	}


