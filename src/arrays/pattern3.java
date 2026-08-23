package arrays;
import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n - 1;
		int star = 1;

		for (int i = 1; i <= n; i++) {

		    for (int j = 0; j < 2 * n - 1; j++) {

		        if (j == space || j == (2 * n - 2 - space))
		            System.out.print("* ");
		        else
		            System.out.print("- ");
		    }

		    space--;
		    star++;   // only updated, not used
		    System.out.println();
		}
	}

}
