package collection2;

import java.util.concurrent.ConcurrentHashMap;
public class ConurrentSample {
	public static void main (String[]args) {
		ConcurrentHashMap<Integer,String> value = new ConcurrentHashMap<>();
		value.put(123,"vikram");
		value.put(234,"vik");
		value.put(345,"ram");
		//System.out.println(value);
		value.remove(123);
		value.forEach((x,y)->System.out.println(x+" "+y));
	}

}

 