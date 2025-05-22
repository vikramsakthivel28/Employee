package forLogic;

public class Primenumber {
	public static void main(String[]args) {
		//int num = 20;
		for(int i=1; i<=20; i++) {
			boolean isPrime = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isPrime=false;
				}
			}
			if(isPrime==true) {
			System.out.println(i);
			}
			
		}
	}

}
 