package arrays;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        int star = 9;
        int space = 0;

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }

            System.out.println();

            space++;
            star -= 2;
        }
    }
}