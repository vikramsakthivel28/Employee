package prperation;

public class IamA {
	public static void main (String[]args) {
		String  a = "i,am,java,develeper";
		String [] b = a.split(",");
		String rev = "";
		for(int i=b.length-1; i>=0; i--) {
			String rev1 = "";
			for(int j=b[i].length()-1; j>=0; j--) {
				rev1=rev1+b[i].charAt(j);
			}
			rev=rev+rev1+" ";
		}
		 System.out.println(rev);
	}
}


