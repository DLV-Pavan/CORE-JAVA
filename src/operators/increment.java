package operators;
import java.util.Scanner;
public class increment {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = 20;
		String res = (age>=18) ? "He is eligible to vote":"He is not eligible to vote";
		System.out.println(res);
	}
}


