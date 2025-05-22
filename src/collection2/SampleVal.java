package collection2;

import java.util.HashMap;

public class SampleVal {

  public static void main (String[]args) {
    String[] key = args[0].split(",");
    int num1 = Integer.parseInt(key[0]);
    int num2 = Integer.parseInt(key[1]);
    int num3 = Integer.parseInt(key[2]);
    
    String[] val = args[1].split(",");
    String var1 = val[0];
    String var2 = val[1];
    String var3 = val[2];
    
    HashMap<Integer,String> carCompany = new HashMap<>();
    carCompany.put(num1,var1);
    carCompany.put(num2,var2);
    carCompany.put(num3,var3);
    
    for(String x : carCompany.values()) {
      System.out.println(x);
    }
  }
}