

package forLogic;

public class UniqueString {
	public static void main (String[]args) {
		String a = "chennai,is,a,big,city,and,chennai,is,in,tamilnadu";
		String[] b = a.split(",");
		String temp  = " ";
		for(int i=0; i<b.length; i++) {
			boolean isDupli = true;
			for(int j=0; j<i; j++) {
				if(b[i].equals(b[j])) {
					isDupli = false;
		    	}
			}
			if(isDupli==true) {
				temp = temp+b[i]+" ";
			}
		}
				System.out.print(temp);
			}
		}  

	


 