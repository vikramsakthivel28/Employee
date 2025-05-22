package forLogic;

public class Armstrong {
	public static void main (String[]args) {
	int num = 153;
	int original = num,sum = 0, digits = 0;
	int temp = num;
	   for(; temp>0; temp/=10) {
		   digits++;
	   }
	   for (temp = num; temp>0; temp/=10) {
		   int digit = temp%10;
		   int power = 1;
		   for(int i=0; i<digits; i++) {
			   power*=digit;
		   }
		   sum+=power;
		   }
	   if(sum==original) {
	   
	   
		System.out.println(sum);
	}
}

}