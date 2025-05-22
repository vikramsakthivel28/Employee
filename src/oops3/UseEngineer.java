package oops3;

public class UseEngineer {
	public static void main (String[]args) {
		Engnieer e = new Engnieer();
		System.out.println(e.instituteName("OneSoft"));
		System.out.println(e.instituteFees(30000));
		System.out.println(e.name());
		System.out.println(e.id());
		System.out.println(e.salary());
	}

}
interface Institute {
	public String instituteName (String name);
	public int instituteFees (int fees);
}
 abstract class Employe {
	 public abstract String name () ;
	 public abstract int id ();	
	 public  int salary () {
		 return 35000;
	 }
}
 
class Engnieer extends Employe implements Institute { 
	
	 public String name () {
		 return "Vikram";
	 }
	 public  int id () {
		 return 1620;
	 }
	 public String instituteName (String name) {
			return name;
		}
		public int instituteFees (int fees) {
			return fees;
		}
		public int salary() {
			return 35000+5000;
		}
	 
}  
	



