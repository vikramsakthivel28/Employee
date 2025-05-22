package stringmetheds;

public class Booleanmethod1 {
	public static void main (String[]args) {
		String a1 = "Vasanth";
		String a2 = "Vikram";
		
		// we use equals()
		Boolean a3 = a2.equals(a1);
		Boolean a4 = a1.equals("VASANTH");
		Boolean a5 = a1.equals("VASanth");
		
		// we use equalsignorecase() 
		String b1 = "Vikram";
		Boolean b2 = b1.equalsIgnoreCase("VIKRAM");
		Boolean b3 = "Vasanth".equalsIgnoreCase("VIKRAM");
		Boolean b4 = "Vasanth".equalsIgnoreCase("Vasa");
		
		// we use startsWith()
		String c1 = "Vasanth";
		Boolean c2 = c1.startsWith("V");
		Boolean c3 = c1.startsWith("a");
		Boolean c4 = c1.startsWith("v");
		Boolean c5 = c1.startsWith("va");
		
		// we use endswith()
		String d1 = "Vikram";
		Boolean d2 = d1.endsWith("m");
		Boolean d3 = d1.endsWith("M");
		Boolean d4 = d1.endsWith("am");
		Boolean d5 = d1.endsWith("Ram");
		
		// we use contains()
		String e1 = "Onesoft";
		Boolean e2 = e1.contains("S");
		Boolean e3 = e1.contains("So");
		Boolean e4 = e1.contains("Sf");
		
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		
		
	}

}
