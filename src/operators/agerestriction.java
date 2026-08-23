package operators;
import java.util.Scanner;

public class agerestriction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int age = 20;

        String res = (age >= 18)
                ? "Movie Allowed"
                : "Movie Not Allowed";

        System.out.println(res);

    }
}