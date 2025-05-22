package java8;

import java.util.Scanner;

public class ScannarClassStringsample {
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first Name");
		String a = s.nextLine();
		System.out.println("enter the second name");
		String b = s.nextLine();
		String name = a.concat(b);
		System.out.println(name);
	}

}
 