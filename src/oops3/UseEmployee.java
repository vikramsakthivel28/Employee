package oops3;

public interface UseEmployee {
	public static void main (String[]args) {
		Employee e = new Engineer();
		System.out.println(e.name());
		
		Engineer r = new Engineer();
		System.out.println(r.qualification("BE"));
		System.out.println(e.salary());
	}

}
 abstract class Employee {
	 public String name () {
		 return "Nisha";
	 }
	 public abstract int salary ();
 }
 class Engineer extends Employee {
	 public int salary() {
		 return 50000+2000;
	 }
	 public String qualification(String a) {
		 return a;
	 }
 }    