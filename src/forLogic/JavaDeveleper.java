package forLogic;

public class JavaDeveleper {
	public static void main (String[]args) {
		String[] word = {"I","am","A","Java","Develper"};
		String rev = "";
		for(int i=0; i<word.length; i++) {
			String rev1 = "";
			for(int j=word[i].length()-1; j>=0; j--) {
				rev1=rev1+word[i].charAt(j);
			}
			rev=rev+" "+rev1;
		}
		
			System.out.println(rev);
			
			}
		}
	


