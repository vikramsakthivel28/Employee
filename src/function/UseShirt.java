package function;

public class UseShirt {
	public static void main (String[]args) {
		Shirt shirt1 = new Shirt();
		shirt1.brand = "Arrow";
		shirt1.price = 2500;
		shirt1.size = 36;
		shirt1.fabric = "cotton"; 
		shirt1.isCheked = true;
		
		Shirt shirt2 = new Shirt();
		shirt2.brand = "Raymond";
		shirt2.price = 3000;
		shirt2.size = 38;
		shirt2.fabric = "blends";
		shirt2.isCheked = true;
		
		Shirt shirt3 = new Shirt();
		shirt3.brand = "jack & jones";
		shirt3.price = 2000;
		shirt3.size = 40;
		shirt3.fabric = "polyester";
		shirt3.isCheked = false;
		
		Shirt shirt4 = new Shirt();
		shirt4.brand = "Allen Solly";
		shirt4.price = 1500;
		shirt4.size = 42;
		shirt4.fabric = "cotton";
		shirt4.isCheked = false;
		
		Shirt[] shirts = {shirt1,shirt2,shirt3,shirt4};
		shirt1.shirt(shirts);
		System.out.println(shirt1.getmax(shirts));
	}

}
class Shirt {
	String brand;
	int price;
	int size;
	String fabric;
	boolean isCheked;
	public void shirt(Shirt[] shirts) {
		for(Shirt x : shirts) {
			System.out.println(x.brand);
		}
	}
	public String getmax(Shirt[] shirts) {
		Shirt max = shirts[0];
		for(Shirt z : shirts) {
			if(z.price>max.price) {
				max.price=z.price;
			}
		}
		return max.brand;
		
	}
}