package prperation;

public class HeigstFact {
	public static void main (String[]args) {
		int [] a = {1,3,2,4};
		int hig = a[0];
		int fact = 1;
		for(int i=0; i<a.length; i++) {
			if(a[i]>hig) {
				hig=a[i];
			}
		}
		for(int i=1; i<hig; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
