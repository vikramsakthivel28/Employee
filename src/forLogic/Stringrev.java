package forLogic;

public class Stringrev {
	public static void main (String[]args) {
		String[] a = {"iam","vikram"};
		String rev = "";
		for(int i=a.length -1; i>=0; i--) {
			String rev1 = " ";
			for(int j=a[i].length()-1; j>=i; j--) {
				rev1 = rev1+a[i].charAt(j);
			}
			rev = rev+" "+rev1;
		}
		System.out.println(rev);
	}

}
