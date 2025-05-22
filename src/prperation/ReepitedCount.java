package prperation;

public class ReepitedCount {
	public static void main (String[]args) {
		String a = "mahadev";
		char[] b = a.toCharArray();
		for(int i=0; i<a.length(); i++) {
			int count = 0;
			for(int j=i+1; j<a.length(); j++) {
				if(b[i]==b[j]) {
					count++;
					b[j]='$';
				}
			}
			if(count>0 && b[i]!='$') {
				System.out.println(b[i]+"="+count);
				
			}
		}
	}

}
