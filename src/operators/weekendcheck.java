package operators;
import java.util.Scanner;
public class weekendcheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int weekend = 6;
		int weekend1 = 7;
		String res = (weekend == 6 && weekend1 == 7) ? "Saturday":"Sunday";
		System.out.println(res);
	}
}