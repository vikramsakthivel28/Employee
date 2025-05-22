package oops3;

public interface UseSmartPhone {
	public static void main (String[]args) {
		SmartPhone sp = new Samsung();
		System.out.println(sp.videoCall());
		System.out.println(sp.cameraFunction("SingleTap"));
	}
 
}
interface SmartPhone {
	public String voiceCall();
	public String videoCall();
	public String connectivity();
	public String cameraFunction(String tapping);
}
class Samsung implements SmartPhone {
	public String voiceCall() {
		return "voiceCall";
	}
	public String videoCall() {
		return "videoCall";
	}
	public String connectivity() {
		return "Connencting"; 
	}  
	public String cameraFunction (String TapOnScreen) {
	 	switch(TapOnScreen) {
		case "SingleTap":
			return "Taking Prictures";
		case "Duble Tap":
			return "Zooming";
		case "Continuous Tap":
			return "Continuous shorts"; 
		default:
			return "Invalid Input"; 
		}
	}
} 