package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class UseMask {

  public static void main (String[]args) {
    String[] keyset = args[1].split(",");
    int b1 = Integer.parseInt(keyset[0]);
    int b2 = Integer.parseInt(keyset[1]);
    int b3 = Integer.parseInt(keyset[2]);
    int b4 = Integer.parseInt(keyset[3]);
    int b5 = Integer.parseInt(keyset[4]);
    
    
    String[] bc = args[0].split(",");
    String a = bc[0];
    String b = bc[1];
    String c = bc[2];
    String d = bc[3];
    String e = bc[4];
    
    Mask m1 = new Mask(b1);
    Mask m2 = new Mask(b2);
    Mask m3 = new Mask(b3);
    Mask m4 = new Mask(b4);
    Mask m5 = new Mask(b5);
    HashMap<String,Mask> masks = new HashMap<>();
    masks.put(a,m1);
    masks.put(b,m2);
    masks.put(c,m3);
    masks.put(d,m4);
    masks.put(e,m5);
    int hig = 0;
   for(Mask x : masks.values()) {
     if(x.getPrice()>hig) {
       hig=x.getPrice();
     }
   }
     System.out.println(hig+" is high price mask");
  }
}
class Mask {
  private int price;
  public Mask(int price) {
    this.price=price;
}
  public String toString() {
    return "Price="+price;
  }
  public void setPrice(int p) {
    price=p;
  }
  public int getPrice() {
    return price;
  }
}