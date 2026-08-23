package operators;

import java.util.Scanner;

public class maxthreenumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String res = (a >= b && a >= c) ? "a"
                : (b >= a && b >= c) ? "b"
                : "c";
		System.out.println(res);
		

	}

}
