package java8;

public class UseStaticMethod {
	public static void main (String[]args) {
		System.out.println(StaticMethod.getName());
		
		StaticMethod m = new StaticMethod();
		System.out.println(m.getName());
		System.out.println(m.getAge());
		
		sm s = new sm();
		System.out.println(s.getAge());
		System.out.println(s.getName());
	}

}
class StaticMethod { 
	public static String getName() {
		return "vasanth";
	}
	public int getAge() {
		return 29;
	}
}
class sm extends StaticMethod {
	public int getAge() {
		return 25;
	}
	public static String getName() {
		return "ragu";
	}
} 