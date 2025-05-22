package execpion;

public class NullPointerExecption {
	public static void main (String[]args) {
		String a = null;
		try {
			String b = a.toUpperCase();
		}
		catch (NullPointerException ne) {
//			System.out.println(ne);
			System.out.println(ne.getMessage());
//			ne.printStackTrace();
		}
		finally {
			System.out.println("Finall black");
		}
	}

}
