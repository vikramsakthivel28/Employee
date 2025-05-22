package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefrance {
	public static void main (String[]args) {
		String[] b = {"java","python","C++"};
		Length l = a-> {
			String max = "";
			for(int i=0; i<a.length; i++) {
				if(a[i].length()>max.length()) {
					max=a[i];
				}
			}
			return max;
		};
		System.out.println(l.getMaxLength(b));
		
		// METHOD REFRANCE 
		maxLength m = new maxLength();
		
		/** USING STATIC **/
		Length x = maxLength::getMaxl;
		System.out.println(x.getMaxLength(b));
		
		System.out.println(maxLength.getLastChar(b));
		m.getChar(b);
		
		System.out.println(m.priceSecLength(b));
		
	 	/** NOT USING STATIC **/
//	    Length y = m::getMaxl;
//		System.out.println(y.getMaxLength(b));
	} 
   
}   
@FunctionalInterface
interface Length {
	public String getMaxLength(String[] a);
}
class maxLength {
	public static String getMaxl(String[] a) {
		String maxL = "";
		for(int i=0; i<a.length; i++ ) {
			if(a[i].length()>maxL.length()) {
				maxL=a[i];
			} 
		}
		return maxL;
	}
	
	public static char getLastChar(String[] a) {
		String maxL = "";
		for(int i=0; i<a.length; i++ ) {
			if(a[i].length()>maxL.length()) {
				maxL=a[i];
			} 
		}
		return maxL.charAt(maxL.length()-2);
	}
	
	public void getChar(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i].charAt(a[i].length()-1));
		}		
	}
	   
    public String priceSecLength(String[] a)  {
    	List<String> listInt = Arrays.stream(a).collect(Collectors.toList());
    		return  listInt.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    
    } 
}