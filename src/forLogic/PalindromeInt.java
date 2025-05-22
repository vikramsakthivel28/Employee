package forLogic;

public class PalindromeInt {
	public static void main (String[]args) {
		int num = 4004;
		int org = num;
		int rev = 0;
		while(num>0) {
			int digit = num%10;
			rev = rev*10+digit;
			num/=10;
		}
		 if(num==rev) {
			 System.out.println("Palindrome");
		 }
		 else {
			 System.out.println("Not palindrome");
		 }
		}
	}


