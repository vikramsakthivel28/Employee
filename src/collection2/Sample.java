package collection2;

import java.util.HashMap;

public class Sample {
	public static void main (String[]args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(570,"nisha");
		hm.put(1235, "kumre");
		hm.put(583, "karthik");
		hm.put(688, "nisha");
		for(Integer x : hm.keySet()) {
			//System.out.println(x);
		}
		for(String y : hm.values()) {
			//System.out.println(y);
		}
		for(Integer z : hm.keySet()) {
			//System.out.println(z+" "+hm.get(z));
		}
		// hm.forEach((x,y)-> System.out.println(x+" "+y));
		
		// hm.keySet().forEach((x)-> System.out.println(x));
		 
		// hm.values().forEach(y-> System.out.println(y));
		
		   hm.keySet().forEach(z-> System.out.println(z+" "+hm.get(z)));
	}

}
