package arrays;

public class verticalpattern {
	public static void main(String args[]) {
		int n=6;
		int star=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
