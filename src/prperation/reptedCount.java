package prperation;

public class reptedCount {
	public static void main (String[]arg) {
		int [] a = {1,2,2,3,4,5,5,6,6,};
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			int count = 0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='$';
				}
				}
				if(count==0 && a[i]!='$') {
					sum++;
					System.out.println(a[i]);
				}
			}
			System.out.println(sum);
		}
	}	

