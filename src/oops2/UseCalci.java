package oops2;
                  // method overloading
public class UseCalci {
	public static void main (String[]args) {
		Calci c = new Calci();
		System.out.println(c.getsum(10, 20));
		System.out.println(c.getsum(10, 20, 30));
		int[] a = {10,20,30,40,50};
		System.out.println(c.getsum(a));
	}

}
class Calci {
	public int getsum(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public int getsum(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	public String getsum(int[]a) {
		int total=0;
		for(int i=0; i<a.length;i++) {
			total=total+a[i];
		}
		return "TOTAL="+total;
	}
}