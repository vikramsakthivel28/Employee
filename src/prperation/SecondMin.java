package prperation;

public class SecondMin {
	public static void main (String[]args) {
		int [] a = {10,50,80,60,30,40,20,70};
		int temp =0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);
	}

}
