package java8;

import java.util.Scanner;

public class ScannaerMaxFind {
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		
		System.err.println("Enter the First Value");
		int a = s.nextInt();
		
		System.err.println("Enter the Second Value");
		int b = s.nextInt();
		
//		int max = (a>b)? a:b;
//		System.out.println("The Maximum Number is:"+max);
		
		if(a>b) {
			System.out.println("The Maximum Number is:"+a);
		}
		else {
			System.out.println("The Maximum Number is:"+b);
		}
	}
}
