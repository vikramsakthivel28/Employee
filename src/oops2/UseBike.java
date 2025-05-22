package oops2;

public class UseBike {
	public static void main (String[]args) {
		Car c = new Car();
		System.out.println(c.getbrand("TATA"));
		System.out.println(c.getModel("XYZ"));
		System.out.println(c.getisPetrol(false));
		System.out.println(c.getNoOfveh(2));
		
		Bike b = new Bike();
		System.out.println(b.getBikeName("YAMAHA"));
		System.out.println(b.getPrice(1800000));
		System.out.println(b.getNoOfveh(4));
		System.out.println(b.getisPetrol(true));
	}
}
          // Hierarchical inheritance
         
class Vehicle {
	public int getNoOfveh (int NoOfVeh) {
		return NoOfVeh;
	}
	public boolean getisPetrol(boolean isPetrol) {
		return isPetrol;
	}
}
class Car extends Vehicle {
	public String getbrand (String brand) {
		return brand;
	}
	public String getModel(String model) {
		return model;
	}
}
class Bike extends Vehicle {
	public String getBikeName(String BikeName) {
		return BikeName;
	}
	public int getPrice(int price) {
		return price;
	}
}