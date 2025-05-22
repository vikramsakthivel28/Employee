package forLogic;

public class DuplicateAndNonDuplicate {
	public static void main(String args[]) {
		String a="poovarasan";
		char b[]=a.toCharArray();
		int duplicount=0;
		int Nduplicount=0;
		
		for(int i=0;i<b.length;i++) {
			if (b[i] == '$') continue; // Skip already counted characters
			int count=1;
			for(int j=i+1;j<b.length;j++) {
				if(b[i]==b[j]) {
					count++;
					b[j]='$';
				}
			}
			if(count>1) {
				duplicount=duplicount+count;
			}else
				Nduplicount++;
			
		}
		System.out.println("Duplicate:"+duplicount);
		System.out.println("NonDuplicate: "+Nduplicount);
	}
}
