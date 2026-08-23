package Strings;
import java.util.Scanner;
public class countingwords {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string: ");
		String s =sc.nextLine();
		
		String words[] = s.split(" ");
		System.out.println(words.length);
		
	}

}
