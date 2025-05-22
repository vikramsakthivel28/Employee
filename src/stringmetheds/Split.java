package stringmetheds;

public class Split {
	public static void main(String[]args) {
		String a = "Hello,Wold";
		String[] b = a.split(",");
		String m = b[0];
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[b.length-1]);
		System.out.println(m);
		
	}

}
