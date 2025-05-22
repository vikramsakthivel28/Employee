package condition;

public class Time11 {
	public static void main (String[]args) {
		int time = 11;
		if (time>6 && time>=11) {
			System.out.println(time+"GM");
		}
		else if (time<12 && time<15) {
			System.out.println(time+"Gnoon");
		}
		else if (time<16 && time<20) {
			System.out.println(time+"Geve");
		}
		else {
			System.out.println(time+"GN");
		}
	}

}
