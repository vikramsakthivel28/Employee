package stringmetheds;

public class Array {
	public static void main (String[]args) {
		String [] name = {"Vasanth","Vikram","Hari","Haran"};
		System.out.println(name[0]+","+name[2]+","+name.length+","+name[name.length-1]);
		String a = name[name.length-1];
		char c=a.charAt(a.length()-1);
		System.out.println(c);
	}

}
