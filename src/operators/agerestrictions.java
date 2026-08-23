package operators;

import java.util.Scanner;

public class agerestrictions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        String res = (!(age < 18)) ? "Allowed" : "Not Allowed";
        System.out.println(res);
    }
}
