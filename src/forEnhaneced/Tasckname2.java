package forEnhaneced;

public class Tasckname2 {
	public static void main (String[]args) {
		String [] name = {"vikram","vasanth","kmr","hari"};
		int count = 0;
		for(int i=0; i<name.length; i++) {
			if(name[i].contains("a")||name[i].contains("e")||name[i].contains("i")||name[i].contains("o")||name[i].contains("u")) {
			count++;
			}
		}
		
			System.out.println(count);
		}
}

 
