package operators;
import java.util.Scanner;
public class positiveornegative {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = (num>0) ? "Positive" : "Negative";
		System.out.println(res);
	}

}
