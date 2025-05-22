package oops2;

public class UseFruit {
	public static void main (String[]args) {
		Fruit f = new Fruit();
			f.name="fruits";
			f.noOfFruit=3;
			Apple a = new Apple() ;
			a.name1="apple";
			a.color1="red";
			Orange o = new Orange();
			o.name2="orange";
			o.color2="orangcolor";
			Mango m = new Mango();
			m.name3="mango";
			m.color3="yollo";
			
			System.out.println(f.name+", "+f.noOfFruit+", "+a.name1+", "+a.color1+", "+o.name2+", "+o.color2+", "+m.name3+", "+m.color3);
			
		
	}

}
class Fruit {
	String name;
	int noOfFruit;
}
class Apple extends Fruit{
	String name1;
	String color1;
}
class Orange extends Fruit {
	String name2;
	String color2;
}
class Mango extends Fruit {
	String name3; 
	String color3;
}