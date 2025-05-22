package prperation;

public class CountSum {
	public static void main (String[]args) {
		int a = 10;
		int count = 0;
		int sum = 0;
		for(int i=0; i<a; i++) {
			if(i%2==0) {
				count++;
				sum = sum+i;
				System.out.println(i);
			}
		}
		System.out.println(count+","+sum);
	}

}
