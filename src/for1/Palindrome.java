package for1;

public class Palindrome {
	public static void main (String[]args) {
		String m ="MADAM";
		String rev = "";
		for (int i=m.length()-1; i>=0; i--) {
			rev = rev+m.charAt(i);
		}
		if(m.equals(rev)) {
			System.out.println("PALINDROME");
		
		}
		else {
			System.out.println("NOT PALINDROME");
		}
		
	}

}
