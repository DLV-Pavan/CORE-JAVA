package operators;

import java.util.Scanner;

public class drivinglicense {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		boolean hasaadhaar = sc.nextBoolean();
		String res = (age>=18 && hasaadhaar) ? "eligible" : "not eligible";
		System.out.println(res);
	}
}
