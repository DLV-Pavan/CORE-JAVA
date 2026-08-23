package operators;

import java.util.Scanner;

public class passorfail {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		String res = (marks >= 35) ? "Pass" : "Fail";
		System.out.println(res);
	}

}
