package condition;

public class Sample1 {
	public static void main (String[]args) {
		String a = "Hello";
		if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
			System.out.println(a+"contains vowels");
		}
		else {
			System.out.println(a+"does not vowels");
		}
	}

}
