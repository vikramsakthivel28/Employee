package object;

public class Useac {
	public static void main (String[]args) {
		Ac a = new Ac();
		a.brand = "samsung";
		a.price = 30000;
		a.tax = 10;
		a.wearranty = false;
	     a.seving = "10%";
	     String b = a.brand.toUpperCase();
		System.out.println(a.brand+a.price+a.tax+a.wearranty+a.seving);
		System.out.println(b);
		
	}

}
