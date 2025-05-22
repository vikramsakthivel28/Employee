package oops1;

public class UseShirt1 {
	public static void main (String[]args) {
		Shirt s = new Shirt("OTTO",750,'X');
		System.out.println(s); 

   }
}
class Shirt1 {
	private String brand;
	private int price;
	private char size;
	public Shirt1 (String brand, int price, char size) {
		this.brand=brand;
		this.price=price;
		this.size=size;
	}
	public String toString() {
		//return brand+price+size;
	            //(or)
		return "Brand: "+brand+", "+"Price: "+price+", "+"Size: "+size;
	}
}









