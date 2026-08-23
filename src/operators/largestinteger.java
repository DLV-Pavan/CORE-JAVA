package operators;

import java.util.Scanner;

public class largestinteger {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String res = (a > b) ? "larger" : "smaller";
		System.out.println(res);
	}

}
