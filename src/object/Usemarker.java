package object;

public class Usemarker {
	public static void main(String[]args) {
		Marker m = new Marker();
		m.brand="camlin";
		m.price = 50;
		m.weight = 10.05f;
		m.tax = 10;
		m.waerranty = true;
		 
	    System.out.println(m.brand+m.price+m.weight+m.tax+m.waerranty);
	    Marker a = new Marker();
	     a.brand = "pentonic";
	     a.price = 60;
	     int avgprice = m.price+a.price;
	     System.out.println(avgprice);
	     
		
	}

}
