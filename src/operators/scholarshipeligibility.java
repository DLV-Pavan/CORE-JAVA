package operators;

import java.util.Scanner;

public class scholarshipeligibility {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		boolean sportquota = true;
		String res = (marks>=90 || sportquota) ? "eligible" : "not eligible";
		System.out.println(res);
	}

}
