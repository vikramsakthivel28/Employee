package function;

public class UseTotal {
	public static void main (String[]args) {
		Total t = new Total();
		t.total();
		System.out.println(t.avg());
		
	}

}

class Total  {
	public void total() {
	int a = 10;
	int b = 20;
	int c = 30;
	System.out.println(a+b+c);
	}
	public int avg() {
		int a = 10;
		int b = 20;
		int c = 30;
		int a1 = (a+b+c);
		return (a+b+c%a1);
		
		
	}
}