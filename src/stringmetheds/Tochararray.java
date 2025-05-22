package stringmetheds;

public class Tochararray {
	public static void main (String[]args) {
		String name = "Tamilnadu";
		char[] a = name.toCharArray();
		char b = name.charAt(8);
		System.out.println(b);
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
	}

}
