package java8;

public class UsePriceCalculation {
	    public static void main(String[] args) {
	        int basePrice = 2000;

	        // First implementation: tax and discount as PERCENTAGES
	        PriceCalculation percentageCalc = (amount, taxPercent, discountPercent) -> {
	            int taxAmount = amount * taxPercent / 100;
	            int discountAmount = amount * discountPercent / 100;
	            return amount + taxAmount - discountAmount;
	        };

	        int netPricePercent = percentageCalc.findNetPrice(basePrice, 10, 5); // 10% tax, 5% discount
	        System.out.println("Net Price (using percentage): $" + netPricePercent);

	        // Second implementation: tax and discount as FIXED AMOUNTS
	        PriceCalculation amountCalc = (amount, taxAmount, discountAmount) -> {
	            return amount + taxAmount - discountAmount;
	        };

	        int netPriceAmount = amountCalc.findNetPrice(basePrice, 100, 50); // $100 tax, $50 discount
	        System.out.println("Net Price (using fixed amounts): $" + netPriceAmount);
	    }
	}


@FunctionalInterface
 interface PriceCalculation {
    int findNetPrice(int amount, int tax, int discount);
}

