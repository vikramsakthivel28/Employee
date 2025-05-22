package oops2;

public interface UseLaptop {
	public static void main (String[]args) {
		Laptop l = new Laptop();
		System.out.println(l.getbrand("ASUS"));
		System.out.println(l.getisRTX(true));
		System.out.println(l.getname("HP"));
		System.out.println(l.getprice(50000));
		System.out.println(l.OfficeLapBrand("DEEL"));
	}
            // Multipel Inhertance 
}
interface GameLap {
	public String getbrand(String brand);
	public boolean getisRTX(boolean isRTX);
}
interface StatyLap {
	public String getname(String name);
	public int getprice(int price);
}
interface OfficeLap {
	public String OfficeLapBrand(String Office);
}
class Laptop implements GameLap,StatyLap,OfficeLap {
	public String getbrand(String brand) {
		return brand;
	}
	public boolean getisRTX(boolean isRTX) {
		return isRTX;
	}
	public String getname(String name) {
		return name;
	}
	public int getprice(int price) {
		return price;
	}
	public String OfficeLapBrand(String Office) {
		return Office;
	}
}  