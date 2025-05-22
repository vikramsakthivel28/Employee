package execpion;

public class CoustemWithMessegeExceptionUseAge {
	
	/** MASSEG EXCEPTION **/
	        
	public static void main (String[]args) throws AgeException {
		int age = 17;
		try {
			if(age>=18) {
				System.out.println("Eligible for vote");
			}
			else {
				throw new AgeException1("not Eligible");
			}
		}
		catch(AgeException1 ae) {
//			System.out.println(ae);
			System.out.println(ae.getMessage());
//		    ae.printStackTrace();
		}
	}

}
class AgeException1 extends Exception {
	public AgeException1(String a) {
		super(a);
	}
}