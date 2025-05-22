package for2;

public class BalkEven {
	public static void main (String[]args) {
		int [] nums = {12,11,15,16,17,19};
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				count=count+1;
			}
		}
			System.out.println(count);
		}
	}


