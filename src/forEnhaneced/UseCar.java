package forEnhaneced;

public class UseCar {
	public static void main(String[] args) {

		Car car = new Car();
		car.brand = "TATA";
		car.model = "XII";
		car.color = "Gray";
		car.price = 7000000;
		car.taxAmount = 7500;
		car.isPetrol = true;
		car.weight = 500.55f;
		// Car1
		Car car1 = new Car();
		car1.brand = "MARUTHI";
		car1.model = "X";
		car1.color = "Red";
		car1.price = 500001;
		car1.taxAmount = 5000;
		car1.isPetrol = false;
		car1.weight = 450.45f;
		// car2
		Car car2 = new Car();
		car2.brand = "HONDA";
		car2.model = "ZX";
		car2.color = "white";
		car2.price = 600001;
		car2.taxAmount = 6500;
		car2.isPetrol = true;
		car2.weight = 480.40f;
		// car3
		Car car3 = new Car();
		car3.brand = "HYUNDAI";
		car3.model = "XIZ";
		car3.color = "Black";
		car3.price = 4560000;
		car3.taxAmount = 5600;
		car3.isPetrol = true;
		car3.weight = 380.99f;
		// car4
		Car car4 = new Car();
		car4.brand = "HERO";
		car4.model = "XXZ";
		car4.color = "blue";
		car4.price = 57000;
		car4.taxAmount = 4700;
		car4.isPetrol = false;
		car4.weight = 460.60f;

		Car[] cars = { car, car1, car2, car3, car4 };
		Car max = cars[0];
		
		// System.out.println(cars[0]);
		// System.out.println(cars[0].brand+cars[0].model+cars[0].color+cars[0].price+cars[0].taxAmount+cars[0].isPetrol+cars[0].weight);

		    for (int i = 0; i < cars.length; i++) {
		
			// System.out.println("BRAND="+cars[i].brand+"MODEL="+cars[i].model+"COLOR="+cars[i].color+"PRICE="+cars[i].price+"TAXAMOUNT="+cars[i].taxAmount+"ISPETROL="+cars[i].isPetrol+"WEIGHT="+cars[i].weight);
		
			//if (cars[i].price % 2 != 0) {
		    //System.out.println(cars[i].price);
		    //}
		
			//if (cars[i].isPetrol == true) {
			//System.out.println(cars[i].isPetrol);
	    	//}
		
			//if (cars[i].price > max.price) {
		    //System.out.println(max.price);
				
		
			//if (cars[i].brand.length() > max.brand.length()) {
			//max=cars[i];
			//System.out.println(max.brand);
	        //}
		}
	}
} 
