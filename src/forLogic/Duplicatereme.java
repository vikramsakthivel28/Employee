package forLogic;

public class Duplicatereme {
	public static void main (String[]args) {
		int[] a = {5,3,5,1,3,4,6};
		int unique = 0;
		
		for(int i=0; i<a.length; i++) {
			int count = 0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='@';
					
				}
			}
			if(count>=0 && a[i] !='@') {
				unique++;
				System.out.println(a[i]);
			}
			
		}
//				System.out.println(unique);
			}
		}
		

 
 
