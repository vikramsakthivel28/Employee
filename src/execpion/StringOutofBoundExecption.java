package execpion;

public class StringOutofBoundExecption {
	public static void main (String[]args) {
		String a = "hellow";
		try {
			char b = a.charAt(6);
		}
		catch(StringIndexOutOfBoundsException si) {
			System.out.println(si);
			System.out.println(si.getMessage());
			si.printStackTrace();
		}
		finally {
			System.out.println("End");
		}
	
		
	}
}
