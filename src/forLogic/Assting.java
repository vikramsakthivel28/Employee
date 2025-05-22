package forLogic;

public class Assting {
	public static void main (String[]args) {
		int[] a = {10,5,6,3,7,8,4,9,1,2};
		int temp = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}

}
//Select count() from emp where gender=