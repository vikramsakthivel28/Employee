package function;

public class UseCalculator {
	public static void main (String[]args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10,5));
		System.out.println(c.sub());
		c.multi(10,2);
		c.div(); 
	}

}

class Calculator {
	//return type with parameter
	public int add (int a, int b) {
		return a+b;
		}
	//return type without parameter
	public int sub() {
		int a=10;
		int b=20;
		return a-b;
	}
	//void with parameter
	public void multi (int a, int b) {
		System.out.println(a*b);
	}
	//void without parameter
	public void div() {
		int a = 10;
		int b = 2;
		System.out.println(a%b);
	}
	
	
}
