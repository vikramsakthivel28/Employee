package forLogic;

public class DuplicUniqiNondup {
	
	//Duplicate - an - >0
	//Non-Duplicate - b - ==0
	//unique - ban - >=0
	public static void main (String[]args) {
		String word = "banana";
		char[] a = word.toCharArray();
		for(int i=0; i<a.length; i++) {
			int count = 0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='$';
					
				}
			}
			if(count>=0 && a[i] !='$') {
				System.out.println(a[i]);
			}
		}
	
	} 

}
 