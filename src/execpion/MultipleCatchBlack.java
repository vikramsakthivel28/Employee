package execpion;

public class MultipleCatchBlack {
	public static void main (String[]args) {
		String[] names = {"java","python","C++","spring10",null};
		try {
			String nume1 = names[6];
			String name2 = names[5].toUpperCase();
			char firstChar = names[6].charAt(0);
		}
		catch(NullPointerException ne) {
			System.out.println(ne);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai.getMessage());
		}
		catch(StringIndexOutOfBoundsException si) {
			System.out.println(si);
		}
		finally {
			System.out.println("end");
		}
	}

}
