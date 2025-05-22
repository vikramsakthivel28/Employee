package prperation;

public class CartAtName {
	public static void main (String[]args) {
		// even letter char only
		String[] a = {"vasanth","ragu","java"};
		for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length(); j++) {
			if(j%2==0) {
				System.out.println(a[i].charAt(j));
			}
		}
		
		}
	}
}


