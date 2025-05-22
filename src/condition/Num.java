package condition;

public class Num {
	public static void main (String[]args) {
		int num = 12;
		if (num % 2 ==0 && num % 3 ==0) {
			System.out.println(num+"divisible by 2&3");
		}
		else {
			System.out.println(num+"dose not divisible by both");
		}
	}

}
