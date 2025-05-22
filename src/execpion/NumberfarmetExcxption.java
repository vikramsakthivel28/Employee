package execpion;

public class NumberfarmetExcxption {
	public static void main (String[]args) {
		String a = "10A";
		try {
			int b = Integer.parseInt(a);
		}
		catch (NumberFormatException nfe) {
//			System.out.println(nfe);
//			System.out.println(nfe.getMessage());
			nfe.printStackTrace();
		}
		finally {
			System.out.println("Exception handling");
		}
	}
 
}
 


