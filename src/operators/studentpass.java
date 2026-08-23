package operators;
import java.util.Scanner;
public class studentpass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int marks = 50;
		int attendance = 80;
		String res = (marks >= 35 && attendance >= 75) ? "Pass":"Fail";
		System.out.println(res);
	}
}
