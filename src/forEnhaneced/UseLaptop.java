package forEnhaneced;

public class UseLaptop {
	public static void main (String[]args) {
		Laptop lap1 = new Laptop();
		lap1.brand = "ASUS";
		lap1.price = 58999;
		lap1.isWarranty = true;
		Laptop lap2 = new Laptop();
		lap2.brand = "DELL";
		lap2.price = 55000;
		lap2.isWarranty = true;
		Laptop lap3 = new Laptop();
		lap3.brand = "HP";
		lap3.price = 52000;
		lap3.isWarranty = false;
		Laptop lap4 = new Laptop();
		lap4.brand = "LENOVO";
		lap4.price = 56000;
		lap4.isWarranty = true;
		Laptop lap5 = new Laptop();
		lap5.brand = "ACER";
		lap5.price = 51000;
		lap5.isWarranty = false;
		
		
		Laptop[] laps = {lap1,lap2,lap3,lap4,lap5};
		Laptop max = laps[0];
		for(Laptop a : laps) {
			//System.out.println(a.brand+", "+a.price+", "+a.isWarranty);
			
			//if(a.brand.length()%2==0) {
			//	System.out.println(a.brand);
			
			//if(a.brand.length()>max.brand.length()) {
				//max=a;
			//	System.out.println(max.brand);
			
			//int total = lap1.price+lap2.price+lap3.price+lap4.price+lap5.price;
			//System.out.println(total);
			
			//if(a.brand.length()%2==0) {
			//System.out.println(a.price);
			//}
		}
	}
	

}

 
 

class Laptop {
	String brand;
	int price;
	boolean isWarranty;
}
