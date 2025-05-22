package stringmetheds;

public class Stringcacs1 {
	
		public static void main (String[]args) {
			
			// we use tuUppercase()
			String name = "Vasanth";
			String name1 = name.toUpperCase();
			String name2 = "Vasanth".toUpperCase();
			
			// we use Loercase()
			String a = name2.toLowerCase();
			String b = "Vikram".toLowerCase();
			
			// we use concat()
			String a1 = "Vasanth";
			String b1 = "Vikram";
			String a2 = a1.concat(b1);
			String b2 = "Vasanth".concat("Vikram");
			
			// we use length()	
			int b3 = a1.length();
			int b4 = b2.length();
			
		    System.out.println(name);
			System.out.println(name1);
			System.out.println(name2);
			System.out.println(a);
			System.out.println(b);
			System.out.println(a1);
			System.out.println(b1);
			System.out.println(a2);
			System.out.println(b2);
			System.out.println(b3);
			System.out.println(b4);
			
			
			
		}

	}



