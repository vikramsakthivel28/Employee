package forLogic;

public class NotPalindrome {
	public static void main (String[]args) {
	int a = 102;
	int org = a;
	int temp = 0;
	
	for(int i=a; i>0; i=i/10) {
		int b= i%10;
		temp = (temp*10)+b;
	}
		if(temp==org) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
			
		}
		
	

}
}
