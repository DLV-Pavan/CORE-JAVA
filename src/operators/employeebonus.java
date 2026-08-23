package operators;

import java.util.Scanner;

public class employeebonus {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int experience = sc.nextInt();
		int rating = sc.nextInt();
		String res = (experience >= 5 && rating >= 4) ? "bonus eligible" : "bonus not eligible";
		System.out.println(res);
	}

}
