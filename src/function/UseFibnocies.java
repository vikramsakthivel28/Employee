package function;

public class UseFibnocies {
public static void main (String[]args) {
	int a = 10;
	Fibnocies f = new Fibnocies();
	f.fib(a);
}
}

class Fibnocies {
	public void fib (int a) {
		int n1=0,n2=1,n3=0;
		for(int i=1; i<a; i++) {
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}
	}
}