package java8;

public class UseLaptop {
	    public static void main(String[] args) {
	        Lap1 l = new Lap1();
	        Laptop x = l::price;
	        x.price(999.99); 
	        Laptop.details("Dell", "Silver", 16);
	    }
	}

@FunctionalInterface
interface Laptop {
    void price(double amount);

    static void details(String brand, String color, int ram) {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("RAM: " + ram + "GB");
    }
}
class Lap1 implements Laptop {
	public void price(double amount) {
		System.out.println("Price:"+amount);	
	} 
}
  