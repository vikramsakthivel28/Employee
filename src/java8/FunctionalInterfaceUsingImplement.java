package java8;

public class FunctionalInterfaceUsingImplement {
	public static void main (String[]args) {
		Calci1 c = new Calci1();
		System.out.println(c.getAdd(10, 20));
	}
} 
 
@FunctionalInterface 
interface Calci {
	public int getAdd(int a, int b);
}
class Calci1 implements Calci {
	public int getAdd(int a, int b) {
		int sum = a+b;
		return sum;
	}	
}
