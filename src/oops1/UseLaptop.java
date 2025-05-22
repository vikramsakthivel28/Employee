package oops1;

public class UseLaptop {
	public static void main (String[]args) {
		Battery b1 = new Battery();
		b1.name = "EXIDE";
		b1.mah = 20000;
		b1.islithium = true;
		System.out.println(b1.name+", "+b1.mah+", "+b1.islithium);
		
		Laptop l = new Laptop();
		l.brand = "ASUS";
		l.price = 58999;
		l.color = "wight";
		l.isWarranty = true;
		
	}

}
class Battery {
	int mah;
	String name;
	boolean islithium;
}
class Laptop {
	String brand;
	int price;
	String color;
	boolean isWarranty;
	Battery b;
}