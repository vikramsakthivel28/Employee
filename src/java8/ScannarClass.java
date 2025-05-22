package java8;

import java.util.Scanner;

public class ScannarClass {
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Value");
		int a = s.nextInt();
		System.out.println("Enter the Second Value");
		int b = s.nextInt();
		int sum = a+b;
		System.out.println(sum);
		
	}
} 
