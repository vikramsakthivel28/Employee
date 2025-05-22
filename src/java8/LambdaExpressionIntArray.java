package java8;

public class LambdaExpressionIntArray {
	public static void main (String[]args) {
		int [] b = {10,20,30,40,50};
	// lambda expression	
		IntSum sum = a->{
			int total =0;
			for(int i=0; i<a.length;i++) {
				total=total+a[i];
			}
			return total;
				
			};
			System.out.println(sum.getSum(b));
			
			
			// methode reference
			
			myClass m=new myClass();
			
			IntSum i=m::getAdd;
			System.out.println(i.getSum(b));
			
//			IntSum i=myClass::getAdd;
//			System.out.println(i.getSum(b));
	}
}

@FunctionalInterface
interface IntSum {
	public int getSum(int[] a);
}

class myClass { 
	
	public  int getAdd(int [] b) {
		int total =0;
		for(int i=0; i<b.length;i++) {
			total=total+b[i];
		}
		return total;
	}
}