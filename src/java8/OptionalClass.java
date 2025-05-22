package java8;

import java.util.Optional;

public class OptionalClass {
	public static void main (String[]args) {
		String a = null;
		String b = "Kumar";
//		Optional<String> a1 = Optional.of(a);
//		System.out.println(a1);
		
		Optional<String> a2 = Optional.of(b);
		System.out.println(a2);
		
		Optional<String> a3 = Optional.ofNullable(a);
		System.out.println(a3);
		
		Optional<String> a4 = Optional.ofNullable(b);
		System.out.println(a4);
		
		boolean b1 = a4.isPresent();
		System.out.println(b1);
		
		boolean b2 = a3 .isPresent();
		System.out.println(b2);
		 
		boolean c1 = a4.isEmpty();
		System.out.println(c1);
		
		boolean c2 = a3.isEmpty();
		System.out.println(c2);
		
		String d1 = a4.orElse("Vasanth");
		System.out.println(d1);
		
		String d2 = a3.orElse("Vasanth");
		System.out.println(d2);
		
		String f1 = a4.orElseThrow();
		System.out.println(f1);
		
//		String f2 = a3.orElseThrow();
//		System.out.println(f2);
		
		String g1 = a4.orElseThrow(()-> new NullPointerException());
		System.out.println("g1,"+g1);
		
//		String g2 = a3.orElseThrow(()-> new NullPointerException("null"));
//		System.out.println("g2,"+g2);
		
		String h1 = a4.get();
		System.out.println(h1);
	} 

}   
