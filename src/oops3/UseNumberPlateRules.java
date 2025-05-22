package oops3;

public class UseNumberPlateRules {
	public static void main (String[]args) {
		NumberplateRules n = new Tamilnadu();
		System.out.println(n.displayNumberPlateColor("Electric Vehicle"));
	} 

}
interface NumberplateRules {
	public String displayFontStyle(String style);
	public int displayFontSize (int size);
	public String displayNumberPlateColor (String vehicleType);
	public String displayStateCode(String ststeCode);
}
class Tamilnadu implements NumberplateRules {
	
	public String displayFontStyle (String style) {
		return "UpperCase";
	}
	public int displayFontSize (int size) {
		return 10;
	}
	public String displayNumberPlateColor (String vehicleType) {
		if(vehicleType.equals("Private Vehicle")) {
			return "Black With White";
		}
		else if(vehicleType.equals("public Vehicle")) {
			return "Black With Yello";
		}
		else if(vehicleType.equals("Electric Vehicle")) {
			return "Green With White";
		}
		else {
			return "invelid input";
		}
	  }
	public String displayStateCode (String ststeCode) {
		return "TN123";
	}
}