package collection2;
import java.util.HashMap;

public class UsePen {
  public static void main (String[]args) {
    String[] na = args[2].split(",");
    int a = Integer.parseInt(na[0]);
    int b = Integer.parseInt(na[1]);
    int c = Integer.parseInt(na[2]);
    
    String[] bc = args[1].split(",");
    String var1 = bc[0];
    String var2 = bc[1];
    String var3 = bc[2];
    
    String[] cd = args[0].split(",");
    float c1 = Float.parseFloat(cd[0]);
    float c2 = Float.parseFloat(cd[1]);
    float c3 = Float.parseFloat(cd[2]);
    
    Pen p1 = new Pen(c1,var1);
    Pen p2 = new Pen(c2,var2);
    Pen p3 = new Pen(c3,var3);
    HashMap<Integer,Pen> penDetail = new HashMap<>();
    penDetail.put(a,p1);
    penDetail.put(b,p2);
    penDetail.put(c,p3);
    
    penDetail.forEach((key,value)-> System.out.println(key+"="+value));
  }
}
class Pen {
  private float price; 
  private String model;
  public Pen( float price, String model){
    this.price=price;
    this.model=model;
  }
  public String toString() {
    return price+" "+model;
  }
  public void setPrice(float p) {
    price=p;
  }
  public float getPrice() {
    return price;
  }
 
  public void setModel(String m) {
    model=m;
  }
  public String getModel() {
    return model;
  }
}