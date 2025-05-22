package function;

public class UsePalindrome {
	public static void main (String[]args) {
		String b = "DAD";
		Palindrome p = new Palindrome();
		System.out.println(p.pal(b));
	}
}
class Palindrome {
	public String pal(String a) {
		String org = a;
		String rev = "";
		for(int i=a.length()-1; i>=0; i--) {
			rev = rev+a.charAt(i);
		}
		if(rev.equals(org)) {
			return "Palindrome";
		}
		else {
			return "Not Palindrome";
		}
	}
}