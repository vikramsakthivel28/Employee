package oops2;

public class UseHuman {
	public static void main (String[]args) {
		Human h = new Human();
		h.name = "Vikram";
		h.gender="male";
		h.age=24;
		System.out.println(h.name+", "+h.gender+", "+h.age);
		Teacher t = new Teacher();
		t.Qualification="Mechanical";
		t.experince=2.5f;
		t.salary=45000;
		t.name="Vik";
		t.gender="mal";
		t.age=25;
		System.out.println(t.Qualification+", "+t.experince+", "+t.salary+", "+t.name+", "+t.gender+", "+t.age);
	}
        // Singl level Inherritance
}
class Human {
	String name;
	String gender;
	int age;
	
}
class Teacher extends Human {
	String Qualification;
	float experince;
	int salary;
}
