package questions;

public class UseEmployee5 {
	public static void main (String[]args) {
		Address5 a = new Address5();
		a.setdoorNumber(141);
		a.setstreetName("OMR");
		a.settownName("kottivakkam");
		a.setdistrict("chennai");
		a.setstate("TamilNudu");
		a.setpincode(600041);
		System.out.println(a.getdoorNumber()+", "+a.getstreetName()+", "+a.gettownName()+", "+a.getdistrict()+", "+a.getstate()+", "+a.getpincode());
        
		Employee5 e = new Employee5();
		e.setid(1620);
		e.setname("vikram");
		e.setdepartment("Mech");
		e.setage(24);
		e.setsalary(40000);
		e.setrole("Devalaper");
		
		System.out.println(e.getid()+", "+e.getname()+", "+e.getdepartment()+", "+e.getage()+", "+e.getsalary()+", "+e.getrole());
	
	} 

}
class Address5 {
	private int doorNumber;
	private String streetName;
	private String townName;
	private String district;
	private String state;
	private int pincode;
	public void setdoorNumber(int dn) {
		doorNumber=dn;
	}
	public void setstreetName(String sn) {
		streetName=sn;
	}
	public void settownName(String tn) {
		townName=tn;
	}
	public void setdistrict(String d) {
		district=d;
	}
	public void setstate(String s) {
		state=s;
	}
	public void setpincode(int p) {
		pincode=p;
	}
	public int getdoorNumber() {
		return doorNumber;
	}
	public String getstreetName() {
		return streetName;
	}
	public String gettownName() {
		return townName;
	}
	public String getdistrict() {
		return district;
	}
	public String getstate() {
		return state;
	}
	public int getpincode() {
		return pincode;
	}
}
class Employee5 {
	private int id;
	private String name;
	private String department;
	private int age;
	private int salary; 
	private String role;
	
	public void setid(int id) {
		this.id=id;
	}
	public int getid () {
		return id;
	}
	public void setname(String n) {
		name=n;
	}
	public String getname() {
		return  name;
	}
	public void setdepartment(String d) {
		department=d;
	}
	public String getdepartment() {
		return department;
	}
	public void setage(int a) {
		age=a;
	}
	public int getage() {
		return age;
	}
	public void setsalary(int s) {
		salary=s;
	}
	public int getsalary() {
		return salary;
	}
	public void setrole(String r) {
		role=r;
	}
	public String getrole() {
		return role;
	}
}
	

