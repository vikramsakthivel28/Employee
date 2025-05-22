package oops3;

public interface UseBank {
	public static void main (String[]args) {
		AxisBank ab = new AxisBank();
		System.out.println(ab.pin(5360));
		
		Bank b = new AxisBank();
		System.out.println(b.branch("Chennai"));
	}

}
interface Bank {
	public String branch (String a);
	public int pin (int p);
	public long accNum (long l);
}
class AxisBank implements Bank {
	public String branch (String b) {
		return "AxisBank is "+b;
	}
	public int pin (int p) {
		return p;
	}
	public long accNum (long l) {
		return l;
	}
	public String custemerName() {
		return "Nisha";
	}
}