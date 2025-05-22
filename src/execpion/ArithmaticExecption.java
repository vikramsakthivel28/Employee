package execpion;

public class ArithmaticExecption {
	public static void main (String[]args) {
		int a = 10;
		int b = 20;
		int sum = a/b;
		System.out.println(sum);
		int c = 0;
		try {
		int sum1 = b/c;
		}
		catch(ArithmeticException ae) {
//			System.out.println(ae);
//			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		finally {
			System.out.println("End");
		}
	}

}
