package function;

public class UseCube {
	public static void main (String[]args) {
		Cube c = new Cube();
		System.out.println(c.square(10));
		System.out.println(c.cube(20));
	}
	
}
class Cube {
	public int square (int num) {
	   return num*num;
		}
	public int cube (int num) {
			return num*num*num;
	}
}
  