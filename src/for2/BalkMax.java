package for2;

public class BalkMax {
	public static void main (String[]args0) {
		int [] num = {10,20,11,15,18};
		int max = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) {
				max=num[i];
				System.out.println(max);
			}
		}
	}

}
