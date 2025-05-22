package execpion;

public class ArrayIndexOutOfBoundException {
	public static void main (String[]args) {
		String[] names = {"java","python","spring"};
		try {
//			System.out.println(names[3]);
			String a = names[4];
		}
		catch(ArrayIndexOutOfBoundsException ai) {
//			System.out.println(ai);
//			System.out.println(ai.getMessage());
			ai.printStackTrace();
		}
		finally {
			System.out.println("End");
		}
	}

}
