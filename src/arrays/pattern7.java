package arrays;

public class pattern7 {
	public static void main(String args[]) {
		int n=5;
		int star = 5;
		int space = n-star;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			star--;
			space++;
			System.out.println();
		}
	}

}
