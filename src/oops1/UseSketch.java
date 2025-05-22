package oops1;

public class UseSketch {
	public static void main (String[]args) {
		Sketch s1 = new Sketch() ;
		s1.setbrand("X");
		s1.setprice(70);
		s1.setcolor("Blue");
		s1.setmaterial("plastic");
		
		Sketch s2 = new Sketch() ;
		s2.setbrand("Y");
		s2.setprice(60);
		s2.setcolor("Red");
		s2.setmaterial("Woord");
		
		Sketch s3 = new Sketch() ;
		s3.setbrand("Z");
		s3.setprice(50);
		s3.setcolor("black");
		s3.setmaterial("plastic");
		
		Sketch[] sk = {s1,s2,s3};
		int total=0,count=0,avrag=0;
		for(Sketch x : sk) {
			count++;
			total=total+x.getprice();
		}
			avrag=total/count;
			System.out.println(avrag);
			}

}
class Sketch {
	private String brand;
	private int price;
	private String color;
	private String material;
	
	public void setbrand(String b) {brand=b;}
	public void setprice(int p) {price=p;}
	public void setcolor(String c) {color=c;}
	public void setmaterial(String m) {material=m;} 
	
	public String getbrand() { return brand; }
	public int getprice() {return price;}
	public String getcolor() {return color;}
	public String getmaterial() {return material;}
}