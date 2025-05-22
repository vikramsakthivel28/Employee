package for1;

public class BreakStatment {
	public static void main (String[]args) {
		int num1 = 10;
		int num2 = 5;
		for(int i=num1; i>num2; i--) {
			System.out.println(i);
			if(num1==num2) {
				break;
			}
		}
	}

}
