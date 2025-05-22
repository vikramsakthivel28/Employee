package forLogic;

public class ArrayEqualsTask {
	public static void main (String[]args) {
		int [] a = {5,10,15};
		int [] b = {5,10,15};
		boolean istrue = false;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					 istrue = true;
				}
			}
		}
					System.out.println(istrue);
			   
			}
		}
	

