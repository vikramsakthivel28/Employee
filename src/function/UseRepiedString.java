package function;

public class UseRepiedString {
	public static void main (String[]args) {
		RepiedString s = new RepiedString();
		s.rep();
	}

}
class RepiedString {
	public void rep () {
		String a = "one,two,three,one,four,three,five";
		String[] b = a.split(",");
		String c = "";
		for(int i=0; i<b.length; i++) {
			boolean isdop = true;
			for(int j=0; j<i; j++) {
				if(b[i].equals(b[j])) {
					isdop=false;
				}
			}
			if(isdop==true) {
				c=c+" "+b[i];
			}
		}
		System.out.println(c);
	}
}