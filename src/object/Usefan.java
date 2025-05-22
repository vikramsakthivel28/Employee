package object;

public class Usefan {
	public static void main (String[]args) {
		Fan f = new Fan();
		f. brand = "usha";
		f.price = 5000;
		f.tax = 10;
		f.speed = 2500;
		f.waerranty = true;
		System.out.println(f.brand+","+f.price+","+f.speed+","+f.tax+","+f.waerranty);
		
	}

}
