package collection3;

import java.util.stream.Collectors;
import java.util.*;

public class UsePhone {
	public static void main (String[]args) {
		Phone p1 = new Phone("appel",101,60000,"white","iPhone16",true);
		Phone p2 = new Phone("redmi",102,15000,"blue","note12",false);
		Phone p3 = new Phone("sumsung",103,100000,"black","ultra25",true);
		Phone p4 = new Phone("moto",104,20000,"blue","edge50",false);
		Phone p5 = new Phone("vivo",105,30000,"white","v40",true);
		Phone p6 = new Phone("vivo",106,30000,"white","v40",true);
	    
		
		System.err.println("PRINT THE ALL LIST OF OBJECT");
		List<Phone> phones = Arrays.asList(p1,p2,p3,p4,p5,p6);
	    System.out.println(phones);
	    System.err.println(" OR ");
	    phones.forEach(x-> System.out.println(x));
	    
	      
	      System.err.println("USING FILTER WARRANTY PHONE LIST");
	 List<Phone> warrantyPhone = phones.stream().filter(x->x.getisWarranty()==true).collect(Collectors.toList());
     warrantyPhone.forEach(y-> System.out.println(y));
     
    
          System.err.println("USING MAP  BRAND ONELY PRINT");
     List<String> Brand = phones.stream().map(x->x.getName()).collect(Collectors.toList());
     System.out.println(Brand);
     
   
          System.err.println("LIST OF THE MORE THEN 30K PHONES LIST");
     List<Phone> maxPricePhone = phones.stream().filter(x->x.getPrice()>=30000).collect(Collectors.toList());
     maxPricePhone.forEach(x-> System.out.println(x));
     
   
          System.err.println("MORE THEN 30K PHONES PRICE ONELY PRINT");
     List<Integer> Price = phones.stream().filter(z-> z.getPrice()>=30000).map(x->x.getPrice()).collect(Collectors.toList());
     Price.forEach(y-> System.out.println(y));
     
   
          System.err.println("FIND THE MAX PRICE ONELY");     
     int maxPrice = phones.stream().map(x-> x.getPrice()).max(Comparable::compareTo).get();
     System.out.println(maxPrice);
     
   
          System.err.println("FIND THE MAX PRICE OF OBJECT");
     Phone maxObjet = phones.stream().max(Comparator.comparing(Phone::getPrice)).get();
     System.out.println(maxObjet);
     
    
          System.err.println("FIND THE ALL OBJECT COUNT");
     long count = phones.stream().count();
     System.out.println(count);
     
      
          System.err.println("FIND THE WARRANTY PHONE COUNT");
     long cou = phones.stream().filter(x->x.getisWarranty()==true).count();
     System.out.println(cou);
     
      
   
          System.err.println("USING SORDED IN ASCENDING ORDER OF SING VALUE");
     List<Integer> sorted = phones.stream().map(x-> x.getPrice()).sorted().collect(Collectors.toList());
     System.out.println(sorted);
     
  
          System.err.println(" FIND THE DECENDING ORDER IN SING VALUE");
     List<String> sortedBrand = phones.stream().map(x->x.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
     System.out.println(sortedBrand);
     
 
          System.err.println("ASCENDING ORDER IN OBJECT");
     List<Phone> sortObject = phones.stream().sorted(Comparator.comparing(Phone::getId)).collect(Collectors.toList());
     System.out.println(sortObject);
     
     
          System.err.println("DECENDING ORDER IN OBJECT");
     List<Phone>desObject = phones.stream().sorted(Comparator.comparing(Phone::getName).reversed()).collect(Collectors.toList());
     System.out.println(desObject);
     
   
          System.err.println("USING LIMIT IN LIMIT OF FIRST 3");
     List<Phone>limt=phones.stream().limit(3).collect(Collectors.toList());
     System.out.println(limt);
     
  
          System.err.println("USING SKIP IN SIKP THE FIRST 2 OBJECT AND REMENING OBJECT PRINT"); 
     List<Phone>skip=phones.stream().skip(2).collect(Collectors.toList());
     System.out.println(skip);
     
     
          System.err.println("USING FIND FIRST IN FIND THE FIRST OBJECT");
     Phone findFist = phones.stream().findFirst().get();
     System.out.println(findFist);
     
     
          System.err.println("FIND THE SECONED OBJECT");
     Phone findSec = phones.stream().skip(1).findFirst().get();
     System.out.println(findSec);
     
    
          System.err.println("FIND FIRST MAX IN OBJECT");
     Phone maxOb = phones.stream().sorted(Comparator.comparing(Phone::getId).reversed()).findFirst().get();
     System.out.println(maxOb);
     
    
          System.err.println("FIND SECONED MAX IN OBJECT");
     Phone secMax = phones.stream().sorted(Comparator.comparing(Phone::getId).reversed()).skip(1).findFirst().get();
     System.out.println(secMax);
     
     
     System.err.println("FIND THE SECOND MAX PRICE IN SING VALUE");     
     int priceSecMax = phones.stream().map(Phone::getPrice).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
     System.out.println(priceSecMax);
     
  
          System.err.println("USING THE FIND ANY MATCH IN SAMSUNG ONELY");
     boolean any = phones.stream().anyMatch(x-> x.getName().equals("samsung"));
     System.out.println(any);
     
     
     
          System.err.println("USING DISTINCT IN FIND THE UNICK NAME LIST ");
     List<String> distinct = phones.stream().map(x-> x.getName()).distinct().collect(Collectors.toList());
     System.out.println(distinct);
     
     
          System.err.println("USING THE toSet");
     Set <String> setBrand = phones.stream().map(x-> x.getName()).collect(Collectors.toSet());
     System.out.println("toSet Brand:"+setBrand);
     
     
          System.err.println("USING toSet OBJECT");
     Set <Phone> setPhone = phones.stream().collect(Collectors.toSet());
     System.out.println("toset Object:"+setPhone);
     
      
          System.err.println("USING THE toMap");
     Map <Integer,Phone> mapObject = phones.stream().collect(Collectors.toMap(x->x.getId(),y->y ));
     System.out.println("toMap:"+mapObject);
      
     
          System.err.println("USING THE summingInt IN FIND THE PRICE SUM");
     int totalPrice = phones.stream().collect(Collectors.summingInt(x->x.getPrice()));
     System.out.println("total="+totalPrice);
     
     
          System.err.println("USING THE gruopingBy in CERATE LIST IN GRUOP OF THE COLOR COUNT");
     Map<String,Long> group = phones.stream().collect(Collectors.groupingBy(Phone::getColor,Collectors.counting()));
     System.out.println(group);
     
         
    
          System.err.println("FIND THE LEST SECEOND CHARACTOR");
     List<Character> cha = phones.stream().map(x-> x.getName().charAt(x.getName().length()-2)).collect(Collectors.toList());
     System.out.println(cha);
     System.err.println("OR");
     cha.forEach(z-> System.out.println(z));
     
    
          System.err.println("USING map IN WARRANTY PHONE PRICE 10% EXTRA THE ADDED AMOUNT");
     List<Phone> mobile = phones.stream().map(x-> {
    	 if(x.getisWarranty()==true) {
    		 x.setPrice(x.getPrice()+x.getPrice()*10/100);
    	 }
    	 return x;
     }).collect(Collectors.toList());
     System.out.println("mobile"+mobile);
     
     
           System.err.println("USING map IN LESS THEN 10K PHONE DISCOND THE 10%");
     List<Phone>k=phones.stream().map(x-> {
			if(x.getPrice()<10000) {
				x.setPrice(x.getPrice()-x.getPrice()*10/100);
			} return x;
			}).collect(Collectors.toList());
		System.out.println("price"+k);
	     } 	
}

class Phone {
	private String name;
	private int id;
	private int price;
	private String color;
	private String model;
	private boolean isWarranty;
	public Phone(String name, int id, int price, String color, String model, boolean isWarranty) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.color = color;
		this.model = model;
		this.isWarranty = isWarranty;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", id=" + id + ", price=" + price + ", color=" + color + ", model=" + model
				+ ", isWarranty=" + isWarranty + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean getisWarranty() {
		return isWarranty;
	}
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	
}