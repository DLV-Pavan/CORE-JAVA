package operators;

import java.util.Scanner;

public class logicvalidation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        boolean validUser = true;
        boolean validPassword = false;

        String res = (validUser && validPassword)
                ? "Login Successful"
                : "Login Failed";

        System.out.println(res);

    }
}