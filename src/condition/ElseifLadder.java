package condition;

public class ElseifLadder {
	public static void main (String[]args) {
		int tamil = 58;
		int english = 50;
		int maths = 72;
		if(tamil<english&&tamil<maths) {
			System.out.println(tamil+"lowest mark");
			}
		else if (english<tamil&&english<maths) {
			System.out.println(english+"lowest mark");
		}
		else {
			System.out.println(maths+"lowest mark");
		}
	}

}
