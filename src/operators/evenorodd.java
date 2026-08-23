package operators;

import java.util.Scanner;

public class evenorodd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = (num % 2 == 0) ? "even" : "odd";
		System.out.println(res);
	}

}
