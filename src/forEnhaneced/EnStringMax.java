package forEnhaneced;

public class EnStringMax {
	public static void main (String[]args) {
		String [] name = {"hari","haran","vasanth","vikram"};
		String max = name[0];
			for(String a : name) {
				if(a.length()>max.length()) {
				max=a;
				}
			}
				System.out.println(max);
			}
	}



