package collection3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseMobile {
  public static void main (String[] args) {
    String[] a = args[0].split(",");
    String a1 = a[0];
    int a2 = Integer.parseInt(a[1]);
    boolean a3 = Boolean.parseBoolean(a[2]);
    
    String[] b = args[1].split(",");
    String b1 = b[0];
    int b2 = Integer.parseInt(b[1]);
    boolean b3 = Boolean.parseBoolean(b[2]);
    
    String[] c = args[2].split(",");
    String c1 = c[0];
    int c2 = Integer.parseInt(c[1]);
    boolean c3 = Boolean.parseBoolean(c[2]);
    
    Mobile mobile1 = new Mobile(a1,a2,a3);
    Mobile mobile2 = new Mobile(b1,b2,b3);
    Mobile mobile3 = new Mobile(c1,c2,c3);
    
  List<Mobile> mobiles = Arrays.asList(mobile1,mobile2,mobile3);
    List<Mobile> Android = mobiles.stream().filter(x-> x.getIsAndroid()==true).peek(y-> y.setPrice(y.getPrice()-999)).collect(Collectors.toList());
    
    Android.forEach(z-> System.out.println(z));
    
    
    
    /** FIND THE NO 0F SEATES LIST **/
/*
       List<Car> cars = Arrays.asList(car1,car2,car3);
       List<Integer> noOf = cars.stream().map(x-> x.getNoOfSeats()).collect(Collectors.toList());
    
       noOf.forEach(z-> System.out.println(z));            
        */
    
    
    /** FIND THE COLOR TO LOWER CASE **/
    
/*     List<Shirt> shirts = Arrays.asList(shirt1,shirt2,shirt3);
    List<String> Color = shirts.stream().map(x-> x.getColor().toLowerCase()).collect(Collectors.toList());
    
    Color.forEach(z-> System.out.println(z));                   
    */
    
    
    /** FIND THE PRICE LESS THEN 1500 **/
    
/*      List<Door> doors = Arrays.asList(door1,door2,door3);
   long count = doors.stream().filter(x-> x.getPrice()<=1500).count(); 
   
    System.out.println(count);
    */
    
    
    /** FIND THE SECOND CHARACTOR **/
    
/*      List<Marker> markers = Arrays.asList(marker1,marker2,marker3);
    List<Character> chara = markers.stream().map(x-> x.getColor().charAt(1)).collect(Collectors.toList());
    
   chara.forEach(y-> System.out.println(y));
   */
    
    
    /** FIND LIST OF FALSE **/
    
/*      List<TorchLight> torchLights = Arrays.asList(torchlight1,torchlight2,torchlight3);
    List<TorchLight> chara = torchLights.stream().filter(x-> x.getisChargingType()==false).collect(Collectors.toList());
    
   chara.forEach(y-> System.out.println(y));
   */
    
    
    /** FIND THE LAST CHARACTOR **/

/*    List<Character> cha = washingMachines.stream().map(x-> x.getBrand().charAt(x.getBrand().length()-1)).collect(Collectors.toList());
 
    cha.forEach(y-> System.out.println(y));
    */
    
    
    /** PRINT THE LIST OF COLOR (!) NOT EQUAL TO "WHITE"  **/
    
/*     List<Ac>RedAc=acs.stream().filter(x-> !x.getColor().equals("White")).collect(Collectors.toList());
 
    RedAc.forEach(y-> System.out.println(y));
    */
    
    
    /** FEMALE LIST **/

/*     List<Student> female = students.stream().filter(x-> x.getGender().equals("female")).collect(Collectors.toList());
 
    female.forEach(y-> System.out.println(y));
    */
    
    
    /** PRINT ROLLING TYPE ONLY **/
    
/*    ArrayList<Chair> chairs = new ArrayList<>();
    chairs.add(chair1);
    chairs.add(chair2);
    chairs.add(chair3);
    
    List<Boolean> rolling = chairs.stream().map(x-> x.getisRollingType()).collect(Collectors.toList());
    rolling.forEach(y-> System.out.println(y));
    */

    
    /** PRINT STRING COLOR TO UPPER CASE **/
    
/*      ArrayList<LeadPencil> leadPencils = new ArrayList<>();
    leadPencils.add(leadPencil1);
    leadPencils.add(leadPencil2);
    leadPencils.add(leadPencil3);
    
    List<String> color = leadPencils.stream().map(x-> x.getColor().toUpperCase()).collect(Collectors.toList());
    color.forEach(y-> System.out.println(y));
    */
    
    
   /** FIND  START SECND CHARACTER **/
    
/*    ArrayList<Marker> markers = new ArrayList<>();
    markers.add(marker1);
    markers.add(marker2);
    markers.add(marker3);
    
    List<Character> character = markers.stream().map(x-> x.getColor().charAt(1)).collect(Collectors.toList());
    character.forEach(y-> System.out.println(y)); 
    */
     
    
  /** FIND ONLY COLOR  COUNT **/
    
/*    ArrayList<Light> lights = new ArrayList<>();
    lights.add(light1);
    lights.add(light2);
    lights.add(light3);
    
   long count = lights.stream().filter(x-> x.getColor().equals("White")).count();
    System.out.println(count);
    */
    
    
    /** FIND PRICE ONLY **/
    
/*      ArrayList<Mobile> mobiles = new ArrayList<>();
    mobiles.add(mobile1);
    mobiles.add(mobile2);
    mobiles.add(mobile3);
    
   List<Integer> price = mobiles.stream().filter(z-> z.getPrice()>33000).map(x-> x.getPrice()).collect(Collectors.toList());
    price.forEach(y-> System.out.println(y));
    */
    
    
    /** FIND LENGTH OF THE STRING **/
    
/*      ArrayList<Watch> watches = new ArrayList<>();
    watches.add(watch1);
    watches.add(watch2);
    watches.add(watch3);
    
   List<Integer> length = watches.stream().map(x-> x.getBrand().length()).collect(Collectors.toList());
    length.forEach(y-> System.out.println(y));
    */
    
    /** FIND CAPACITY ONLY **/
    
/*     ArrayList<Kettle> kettles = new ArrayList<>();
    kettles.add(kettle1);
    kettles.add(kettle2);
    kettles.add(kettle3);
    
   List<String> capacity = kettles.stream().map(x-> x.getCapacity()).collect(Collectors.toList());
    capacity.forEach(y-> System.out.println(y+","));
    */
    
    
    /** FINT DIRECTOR COUNT **/
    
/*     ArrayList<Song> songs = new ArrayList<>();
    songs.add(song1);
    songs.add(song2);
    songs.add(song3);
    
 long count =  songs.stream().map(x-> x.getMusicDirector()).count();
    System.out.println(count);
    */
    
  }
}
   
class Mobile {
 private String brand;
  private int price;
  private boolean isAndroid;
  public Mobile(String brand, int price, boolean isAndroid) {
    this.brand=brand;
    this.price=price;
    this.isAndroid=isAndroid;
  }
  public String toString() {
    return brand+","+price+","+isAndroid;
  }
  public void setBrand(String b) {
    brand=b;
  }
  public void setPrice(int p) {
    price=p;
  }
  public void setIsAndroid(boolean e) {
    isAndroid=e;
  }
  public String getBrand() {
    return brand;
  }
  public int getPrice() {
    return price;
  }
  public boolean getIsAndroid() {
    return isAndroid;
  }
}
    