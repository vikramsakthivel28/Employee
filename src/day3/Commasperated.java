package day3;

public class Commasperated {
	public static void main (String[]args) {
		String [] b = args[0].split(",");
		int a = Integer.parseInt(b[0]);
		int a1 = Integer.parseInt(b[1]);
		int a2 = Integer.parseInt(b[2]);
		System.out.println(a+","+a1+","+a2);
		System.out.println(a+a1+a2);
		
	}

}
