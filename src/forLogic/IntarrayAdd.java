package forLogic;

public class IntarrayAdd {
	public static void main (String[]args) {
		int [] nums = {5,2,1,9,6,3,4};
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+nums[j]==7) {
					System.out.println("("+nums[i]+", "+nums[j]+")");
				}
			}
		}
	}
}
