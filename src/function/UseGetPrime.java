package function;

public class UseGetPrime {
	public static void main (String[]args) {
		GetPrime p = new GetPrime();
		System.out.println(p.getprime(7));
	}

}
class GetPrime {
	public String getprime (int num) {
		boolean isPrime = true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				isPrime = false;
			}
		}
		if(isPrime==true) {
			return "It is Prime";
		}
		else {
			return "It is Not Prime";
		}
	}
}