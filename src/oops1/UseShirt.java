package oops1;

public class UseShirt {
	public static void main (String[]args) {
		Shirt s = new Shirt("OTTO",750,'X');
		System.out.println(s);
		
		   // SET
		s.setbrand("NEXON");
		System.out.println(s);
		
		s.setbrand("Arrow");
		s.setprice(1000);
		s.setsize('L');
		System.out.println(s);
	}

}
class Shirt {
	private String brand;
	private int price;
	private char size;
	public Shirt (String brand, int price, char size) {
		this.brand=brand;
		this.price=price;
		this.size=size;
	}
	public String toString() {
		//return brand+price+size;
	            //(or)
		return "Brand: "+brand+", "+"Price: "+price+", "+"Size: "+size;
	}
	
	  // GET AND SET
	      // SET
	public void setbrand(String b) {
		brand = b;
	}
	public void setprice(int p) {
		price = p;
	}
	public void setsize(char s) {
		size = s;
	}
	     // GET
	public String getbrand() {
		return brand;
	}
	public int getprice() {
		return price;
	}
	public char getsize () {
		return size;
		
	}
}