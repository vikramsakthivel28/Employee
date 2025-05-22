package collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomer {
	public static void main (String[]args) {
		Customer c1 = new Customer("vikram",1620,true);
		Customer c2 = new Customer("vik",2016,false);
		Customer c3 = new Customer("ram",5614,true);
		HashMap<Integer,Customer> cus = new HashMap<>();
		cus.put(c1.getId(), c1); 
		cus.put(c2.getId(), c2);
		cus.put(c3.getId(), c3);
		//System.out.println(cus);
		
		HashMap<Integer,Customer> cu = new HashMap<>();
		for(Customer x : cus.values()) {
			if(x.getIsRegulaer()==true) {
				cu.put(10, x);
			}
			
		}
		System.out.println(cu);
		
		
//		Iterator<Customer> itr = cus.values().iterator();
//		while(itr.hasNext()) {
//			if(itr.next().getIsRegulaer()!=true) {
//				itr.remove();		
//			}
//		}
//		cus.forEach((x,y)-> System.out.println(x+" "+y));
		
	}
}
class Customer {
	private String name;
	private int id;
	private boolean isRegulaer;
	public Customer(String name, int id, boolean isRegulaer) {
		this.name = name;
		this.id = id;
		this.isRegulaer=isRegulaer;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", isRegulaer=" + isRegulaer + "]";
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
	public boolean getIsRegulaer() {
		return isRegulaer;
	}
	public void setRegulaer(boolean isRegulaer) {
		this.isRegulaer = isRegulaer;
	}
}