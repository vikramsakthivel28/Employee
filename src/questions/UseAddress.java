package questions;

public class UseAddress {
	public static void main (String[]args) {
		Address a = new Address(141,"OMR","Kottivakkam","Chennai","Tamil Nadu",600041);
		a.addresss();
	}

}
class Address {
	int doorNumber;
	String streetName;
	String townName;
	String district;
	String state;
	int pincode;
	public Address (int doorNumber, String streetName, String townName, String district, String state, int pincode) {
		this.doorNumber=doorNumber;
		this.streetName=streetName;
		this.townName=townName;
		this.district=district;
		this.state=state;
		this.pincode=pincode;
	}
	public void addresss() {
		System.out.println("DoorNumber="+doorNumber+", StreetName="+streetName+", TownName="+townName+", District="+district+", State="+state+", PinCode="+pincode);
	}
} 