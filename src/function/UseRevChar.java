package function;

public class UseRevChar {
	public static void main (String[]args) {
		String a = "one,two,three,four,five";
		RevChar r = new RevChar();
		r.rev(a);
	}

}
class RevChar {
	public void rev(String a) {
		String[] b  = a.split(",");
		for(int i=b.length-1; i>=0; i--) {
			
				System.out.println(b[i]);
			}
			
		}
	}
