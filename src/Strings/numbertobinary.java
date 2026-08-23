package Strings;
import java.util.Scanner;
public class numbertobinary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String res = "";
		while(n!=0) {
			int rem = n%2;
			res = rem + res;
			n = n/2;
			
			
		}
		System.out.println(res);
	}
								

}
