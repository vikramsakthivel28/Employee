package execpion;

public class CoustemWithOutMessageExceptionUseAge {
	public static void main (String[]args) throws AgeException {
		int age = 17;
		try {
			if(age>=18) {
				System.out.println("Eligible for vote");
			}
			else {
				throw new AgeException();
			}
		}
		catch(AgeException ae) {
//			System.out.println(ae);
		    ae.printStackTrace();
		}
	}

}
class AgeException extends Exception {
	public AgeException() {
		super();
	}
}
