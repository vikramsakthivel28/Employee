package for1;

public class Primenumber {
	public static void main(String[]args) {
		boolean isprime = true;
		int num = 7;
		for (int i=2; i<num; i++) {
			if(num%i==0) {
				isprime = false;
				
			}
		}
		if (isprime==true) {
			System.out.println("prime");
			
		}
		else {
			System.out.println("Not prime");
		}
	}
	

}
 