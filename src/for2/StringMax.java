package for2;

public class StringMax {
	public static void main (String[]args) {
		String[] name = {"hari","haran","vasanth","vikram"};
		String max = name[0];
		for(int i=0; i<name.length; i++) {
			if(name[i].length()>max.length()) {
			   max=name[i];
			}
		}
				System.out.println(max);
			
		}
	}


