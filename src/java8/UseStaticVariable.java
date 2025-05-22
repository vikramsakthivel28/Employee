package java8;

public class UseStaticVariable {
	public static void main (String[]args) {
		
		System.out.println(StaticVariable.b);
		
		StaticVariable s = new StaticVariable();
		System.out.println(s.a);
		System.out.println(s.b);
		
		StaticVariable s1 = new StaticVariable();
		System.out.println(s1.a);
		System.out.println(s1.b);
		
	}
}

class StaticVariable {
	int a = 10;
	static int b = 20;
	public StaticVariable() {
		a++;
		b++;
	}	
}