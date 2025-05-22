package oops1;

public class UseAc {
	public static void main (String[]args) {
		Compressor c1 = new Compressor();
		c1.setcapcity(200);
		c1.setbrand("ABC");
		System.out.println(c1.getbrand()+", "+c1.getcapcity());
		
		Ac a = new Ac();
		a.setname("LG");
		a.setprice(12000);
		a.setCompressor(c1);
	System.out.println(a.getname()+", "+a.getprice()+", "+a.getc().getcapcity()+", "+a.getc().getbrand());
	
	}
	

}
class Compressor {
	private int capcity;
	private String brand;
	
	public void setcapcity(int capcity) {
		this.capcity = capcity;
	}
	public void setbrand(String b) {
		brand = b;
	}
	
	
	public int getcapcity () {
		return capcity;
	}
	public String getbrand() {
		return brand;
	}
	}
	class Ac {
		private String name;
		private int price;
		private Compressor c;
		public void setname (String name) {
			this.name=name;
		}
		public void setprice (int price) {
			this.price=price;
		}
		public void setCompressor(Compressor c) {
			this.c=c;
		}
		
		
		public String getname() {
			return name;
		}
		public int getprice() {
			return price;
		}
		public Compressor getc() {
			return c;
		}
	}
