package oops2;

         // overriding
public class UseBank {
	public static void main (String[]args) {
		Bank b = new Bank();
		System.out.println(b.getIntrest(1000));
		
		AxisBank ab = new AxisBank();
		System.out.println(ab.getIntrest(1000));
		System.out.println(ab.getname("Vikram"));
	}

}
class Bank {
	public int getIntrest(int amount) {
		return amount*10/100;
	}
}
class AxisBank extends Bank {
	public int getIntrest(int amount) {
		return amount*15/100;
	}
	public String getname (String name) {
		return name;
	}
} 