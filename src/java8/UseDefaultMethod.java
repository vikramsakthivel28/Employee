package java8;

public class UseDefaultMethod {
	public static void main (String[]args) {
		DefaultMethod1 d = new DefaultMethod1();
		System.out.println(DefaultMethod.getName());
//		System.out.println(DefaultMethod.getAge());
		
		System.out.println(d.getAge());
		System.out.println(d.getQualification());
		
	}
}
interface DefaultMethod {
	public static String getName() {
		return "Vasanth";
	}
	public default int getAge() {
		return 27;
	}
	public  String getQualification();		
}
class DefaultMethod1 implements DefaultMethod {

	public int getAge() {
		return 27+2;
	}
	public String getQualification() {
		return "BE";
	}	
}  