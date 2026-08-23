package arrays;

public class continousalphabettriangle {
	public static void main(String args[]) {
		int n=5;
		int val=1;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=val;j++) {
				System.out.print(ch);
				ch++;
			}
			val++;
			System.out.println();
		}
	}

}
