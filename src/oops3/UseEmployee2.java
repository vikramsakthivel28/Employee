package oops3;

public interface UseEmployee2 {
	public static void main (String[]args) {
		Employee2 e = new Engineer2();
		System.out.println(e.name());
		System.out.println(e.id());
		System.out.println(e.salaryperHour());
		System.out.println(e.workingHour());
	}

}
abstract class Employee2 {
	 public abstract String name () ;
	 public abstract int id ();	
	 public abstract int salaryperHour ();
	 public abstract int workingHour ();
}
class Engineer2 extends Employee2 {
	public String name() {
		return "Vikram";
	}
	public int id() {
		return 1620;
	}
	 public int salaryperHour() {
		 return 150;
	 }
	 public int workingHour() {
		 return 8;
	 }
	 public int salaryperDay() {
		  return 150*8;
	 }
} 

