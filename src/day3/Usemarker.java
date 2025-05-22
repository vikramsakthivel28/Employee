package day3;

public class Usemarker {
	public static void main (String[]args) {
		String[] a = args[0].split(",");
		Marker m = new Marker();
		m.brand=a[0];
		m.model=a[1];
		m.price=Integer.parseInt(a[2]);
		m.tax=Integer.parseInt(a[3]);
		m.weight=Float.parseFloat(a[4]);
		m.waranty=Boolean.parseBoolean(a[5]);
		m.taxprice=m.price*m.tax/100;
		m.netprice=m.price+m.taxprice;
		
		System.out.println("brand="+m.brand+","+"model="+m.model+","+"price="+m.price+","+"tax="+m.tax+","+"weight="+m.weight+","+"waranty="+m.waranty);
		System.out.println("taxprice="+m.taxprice+","+"netprice="+m.netprice);
		}
	

}
