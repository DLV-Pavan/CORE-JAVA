package operators;
import java.util.Scanner;
public class gradecalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		String res = (marks >= 90) ? "A" : (marks >= 75) ? "B" : (marks >= 60) ? "C" : (marks >= 35) ? "D" : "Fail";
		System.out.println(res);
	}
}

	
	