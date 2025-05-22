package collection1;

import java.util.ArrayList;

public class Sample1 {
	public static void main(String[]args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("vikram");
		names.add("abc");
		names.add("vasanth");
		names.add("ragu");
		//System.out.println(names);
		
		//System.out.println(names.get(1));
		
		
		for(String a : names){
			//System.out.println(a);
		}
		
		for(int i=names.size()-1; i>=0; i--) {
			//System.out.println(names.get(i));
		}
		names.forEach(x -> System.out.println(x));
	}

}
