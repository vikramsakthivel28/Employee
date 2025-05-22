package day3;

public class Cammatasck {
	public static void main (String[]args) {
		String[] b = args[0].split(",");
		String a = (b[0]);
		int a1 = Integer.parseInt(b[1]);
		float a2 = Float.parseFloat(b[2]);
		long a3 = Long.parseLong(b[3]);
		boolean a4 = Boolean.parseBoolean(b[4]);
		System.out.println("name="+a+","+"age="+a1+","+"weight="+a2+","+"P.NO="+a3+","+"Gender="+a4);
		
	}

}
