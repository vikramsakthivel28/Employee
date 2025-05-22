package day3;

public class Usecar {
	public static void main (String[]args) {
		String[] a = args[0].split(",");
		Car c = new Car();
		c.brand=a[0];
		c.model=a[1];
		c.price=Integer.parseInt(a[2]);
		c.weight=Float.parseFloat(a[3]);
		c.waranty=Boolean.parseBoolean(a[4]);
		System.out.println("brand="+c.brand+","+"model="+c.model+","+"price="+c.price+","+"weight="+c.weight+"waranty="+c.waranty)
	;
		
		
	}

}
