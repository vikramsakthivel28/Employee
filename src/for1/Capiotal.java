package for1;

public class Capiotal {
	public static void main (String[]args) {
		String word = "LaPtOpe";
		int count = 0;
		for(char a : word.toCharArray()) {
			if(Character.isUpperCase(a)) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
 