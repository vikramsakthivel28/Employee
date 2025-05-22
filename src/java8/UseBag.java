package java8;

public class UseBag {
	    public static void main(String[] args) {
	        SchoolBag myBag = new SchoolBag();

	        int price = 1200;
	        int discountAmount = 200;
	        int zips = 4;
	        int warrantyYears = 2;

	        // Call methods
	        myBag.noOfZips(zips);
	        myBag.warranty(warrantyYears);
	        myBag.price(price);

	        // Call static method from interface
	        Bag.discount(price, discountAmount);
	    }
	}

 interface Bag {
    void noOfZips(int count);
    void warranty(int years);
    void price(int amount);

    static void discount(int price, int discountAmount) {
        int finalPrice = price - discountAmount;
        System.out.println("Discounted Price: $" + finalPrice);
    }
}
 class SchoolBag implements Bag {
    public void noOfZips(int count) {
        System.out.println("Number of zips: " + count);
    }
    public void warranty(int years) {
        System.out.println("Warranty: " + years + " years");
    }
    public void price(int amount) {
        System.out.println("Original Price: $" + amount);
    }
}
 