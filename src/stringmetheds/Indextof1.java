package stringmetheds;

public class Indextof1 {
	public static void main (String[]args) {
		
		// we use indexOF()
		String a1 = "ONESOFT";
		int a2 = a1.indexOf("E");
		int a3 = a1.indexOf("s");
		int a4 = "Vikram".indexOf("m");
		
		// we use charAt()
		String b1 = "Malayalam";
		char b2 = b1.charAt(7);
		char b3 = b1.charAt(0);
		char b4 = b1.charAt(b1.length()-1);
		
		// we use substring()
		String long1 = "Malayalam";
		String long2 = long1.substring(2,4);
		String long3 = long1.substring(2,7);
		String long4 = long1.substring(1);
		String long5 = long1.substring(5);
		
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(long2);
		System.out.println(long3);
		System.out.println(long4);
		System.out.println(long5);
		
	}

}
