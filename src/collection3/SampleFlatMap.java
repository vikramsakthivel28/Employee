package collection3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleFlatMap {
	public static void main (String[]args) {
		List<Integer>num=Arrays.asList(10,20,30);
		List<Integer>num1=Arrays.asList(40,50,60);
		
		List<List<Integer>> num3 = Arrays.asList(num,num1);
		System.out.println(num3);
		
		List<Integer>numbers = num3.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(numbers);
		
		
		
		List<String>name1=Arrays.asList("vikram","vasanth","ragu");
		List<String>name2=Arrays.asList("raja","hari","gva");
		
		List<List<String>>name3=Arrays.asList(name1,name2);
		System.out.println(name3);
		
		List<String>names=name3.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(names);
		 
	} 
}
  