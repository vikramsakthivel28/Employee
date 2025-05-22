package for1;

public class ToUpperCase {
	public static void main (String[]args) {
		String word = "onesaft";
		String vowels = "aeiou";
		int count = 0;
		for(char a : word.toCharArray()) {
			if(Character.isLetter(a) && vowels.indexOf(a)==-1) {
				count++;
			
			}
		}
		System.out.println(count);
	}

}
