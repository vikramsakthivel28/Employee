package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class UseMobile {
  public static void main (String[]args) {
    String[] key = args[0].split(",");
    int a = Integer.parseInt(key[0]);
    int b = Integer.parseInt(key[1]);
    int c = Integer.parseInt(key[2]);
    int d = Integer.parseInt(key[3]);
    int e = Integer.parseInt(key[4]);
    
    
    String[] bc = args[1].split(",");
    String b1 = bc[0];
    String b2 = bc[1];
    String b3 = bc[2];
    String b4 = bc[3];
    String b5 = bc[4];

    Mobile m1 = new Mobile(b1);
    Mobile m2 = new Mobile(b2);
    Mobile m3 = new Mobile(b3);
    Mobile m4 = new Mobile(b4);
    Mobile m5 = new Mobile(b5);
    HashMap<Integer,Mobile> mobiles = new HashMap<>();
    mobiles.put(a,m1);
    mobiles.put(b,m2);
    mobiles.put(c,m3);
    mobiles.put(d,m4);
    mobiles.put(e,m5);
    
   for(Integer x : mobiles.keySet()) {
     System.out.println(x);
   }
  }
}
class Mobile {
  private String brand;
 // private int salary;
 // private String company;
  public Mobile(String brand){
    this.brand=brand;
   // this.salary=salary;
   // this.company=company;
  }
  public String toString() {
    return brand;
  }
 
  public void setBrand(String b) {
    brand=b;
  }
  public String getBrand() {
    return brand;
  }
}