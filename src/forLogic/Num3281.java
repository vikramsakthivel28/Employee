package forLogic;

public class Num3281 {
	public static void main (String[]args) {
		int num = 3281;
		int sum = 0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		System.out.println(sum);
	}
}
