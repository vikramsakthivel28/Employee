package function;

public class UseMin {
	public static void main (String[]args) {
		int[] nums = {5,10,20,15,9,18,7,13};
		Min m = new Min();
		System.out.println(m.getmin(nums));
		String[] a = {"onesoft","hello","wold"};
		m.vow(a);
	}

}
class Min {
	public int getmin(int[] a) {
		int min = a[0];
		for(int x : a) {
			if(x<=min) {
				min=x;
				
			}
		}
		return min;
	}
	public void vow(String[]  a) {
		
		for(String x : a) {
			if(x.contains("a")||x.contains("e")||x.contains("i")||x.contains("o")||x.contains("u")) {
				System.out.println(x+" :contains of vowels");
			}
			else {
				System.out.println(x+" :dos Not contains of vowels");
			}
		}
	}
}