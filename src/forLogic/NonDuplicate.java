package forLogic;

public class NonDuplicate {
	public static void main (String[]args) {
		String word = "vivobook";
		char[] a = word.toCharArray();
		int noncount = 0;
		for(int i=0; i<a.length; i++) {
			int count = 0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='@';
				}
			}
			if(count==0 && a[i] !='@') {
				noncount++;
			}
		}
				System.out.println(noncount);
			}
		}


  
