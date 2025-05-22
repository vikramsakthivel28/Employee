package forEnhaneced;

public class EnhancedMax {
	public static void main (String[]args) {
		int [] num = {10,20,30,40,15};
		int max = num[0];
		for(Integer a : num) {
			if(a>max) {
		     max=a;
			}
		}
		
			System.out.println(max);
			
		}
	}
	




