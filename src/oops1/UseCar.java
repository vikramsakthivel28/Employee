package oops1;

public class UseCar {
	public static void main (String[]args) {
		Engine e1 = new Engine();
		e1.cc = 1200;
		e1.name = "NEXON";
		e1.isPetrol = true;
		System.out.println(e1.cc+", "+e1.name+", "+e1.isPetrol);
		Car c = new Car();
		c.color = "blue";
		c.price = 1200000;
		c.isWarranty = true;
		c.brand = "AUDI";
		c.e= e1;
		System.out.println("Car: "+ c.color+", "+c.brand+", "+c.price+", "+c.isWarranty+" Engine: "+c.e.cc+", "+c.e.name+", "+c.e.isPetrol);
	}

}
class Engine {
	int cc;
	String name;
	boolean isPetrol;
}
class Car {
	String color;
	int price;
	boolean isWarranty;
	String brand;
	Engine e;
}