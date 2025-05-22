package object;

public class Taxclass {
	public static void main (String[]args) {
		int price = 2000;
		int tax = 20;
		int taxprice = price*tax%100;
		int netprice = price+taxprice;
		System.out.println(taxprice+","+netprice);
	}

}
