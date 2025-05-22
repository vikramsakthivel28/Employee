package stringmetheds;

public class task {
	public static void main (String[]args) {
		// split
		String a = "JAVA,C++,python,gopal";
		String [] b= a.split(",");
		System.out.println(b[0]);
		System.out.println(b.length);
		System.out.println(b[b.length-1]);
		// upper case
		String c = a.toUpperCase();
		System.out.println(c);
		// Lower case
		String d = a.toLowerCase();
		System.out.println(d);
		// concat method
		String e = b[0];
		System.out.println(e);
		String e1 = b[2];
		System.out.println(e1);
		String e2 = b[3];
		System.out.println(e2);
		String f = e.concat(e1)+(e2);
		System.out.println(f);
	}

}
