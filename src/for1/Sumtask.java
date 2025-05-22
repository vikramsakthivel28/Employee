package for1;

public class Sumtask {
	public static void main (String[]args) {
	int count = 0;
	int tatal = 0;
	for(int i=1; i<=10; i++) {
		if(i%2==0) {
			// even (i%2==0) : add (i%2==1);
			System.out.println(i);
			count=count+1;
			tatal=tatal+i;
			
		}
	}
	System.out.println(count);
	System.out.println(tatal);
	}

}
















