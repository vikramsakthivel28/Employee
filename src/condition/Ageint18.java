package condition;

public class Ageint18 {
	public static void main (String[]args) {
		int age = 18;
		if (age>0&&age<=12) {
			System.out.println(age+"KID");
		}
		else if (age>=13&&age<=20) {
			System.out.println(age+"adult");
		}
		else {
			System.out.println(age+"invalid");
		}
	}

}
