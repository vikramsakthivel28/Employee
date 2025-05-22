package java8;

public class FunctionalInterfaceUsingLambdaExpression {
	public static void main (String[]args) {
		Calci25 c1 = (a,b)-> a+b;
		System.out.println(c1.getAdd(10,20));
		
		Calci25 c2 = (a,b)-> a*b;
		System.out.println(c2.getAdd(20,30));
		
		Calci25 c3 = (a,b)-> {
			if(a>b) {
				return a;
			}
			else {
				return b;
			}
		};
		System.out.println(c3.getAdd(30, 40));
	
	}
}

@FunctionalInterface
interface Calci25 {
	public int getAdd (int a, int b);
} 