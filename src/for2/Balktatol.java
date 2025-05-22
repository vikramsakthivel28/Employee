package for2;

public class Balktatol {
	public static void main (String[]args) {
		int [] nums = {12,11,15,13,17,19};
		int Oddtotal = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2!=0) {
				Oddtotal=Oddtotal+nums[i];
			}
		}
			System.out.println(Oddtotal);
		}
	}
 



 