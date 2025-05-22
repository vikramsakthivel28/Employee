package prperation;

public class UniqueString {
	public static void main (String[]args) {
		String a = "tamilnadu";
		int co = 0;
		int no = 0;
		char [] b = a.toCharArray();
		for(int i=0; i<b.length; i++) {
			int count = 0;
			for(int j=i+1; j<b.length; j++) {
				if(b[i]==b[j]) {
					b[j]='$';
					
				}
			}
			if(count==0 && b[i]!='$') {
				co++;
			}
			else {
				no++;
			}
		}
				System.out.println(no);
			
		
				System.out.println(co);
			
		
	}

}
