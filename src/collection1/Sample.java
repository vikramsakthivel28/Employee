package collection1;

import java.util.ArrayList;

public class Sample {
	public static void main(String[]args) {
		ArrayList<Integer> lms= new ArrayList<>();
		lms.add(10);
		lms.add(20);
		lms.add(35);
		lms.add(40);
		lms.add(50);
		//System.out.println(lms.get(3));
		//System.out.println(lms);
		//lms.remove(2);
		//System.out.println(lms);
		lms.set(1, 15);
		System.err.println(lms);
		
	
	lms.forEach(x->{
		if(x %2!=0) {
			//System.out.println(x);
		}
	}); 

}
}
