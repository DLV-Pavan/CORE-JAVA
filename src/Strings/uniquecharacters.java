package Strings;
import java.util.Scanner;
public class uniquecharacters {
	public static void printUnique(String s) {
		for(int i=0;i<s.length();i++) {
			int count = 0;
			
			for(int j=0;j<i;j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println(s.charAt(i));
			}
		}
	}
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        System.out.print("Unique Characters: ");
        printUnique(s);

}
}

	