package function;

public class UseTable {
	public static void main (String[]args) {
		Table t = new Table();
		t.table2();
		t.table7();
	}

}
class Table {
	public void table2 () {
		int a =1;
		int b = 20;
		for(int i=a; i<b; i++) {
			System.out.println(i*2);
		}
	}
	public void table7 () {
		for(int i=1; i<10; i++) {
			System.out.println(i*7);
		}
	}
	
}