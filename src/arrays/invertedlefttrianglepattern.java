package arrays;

public class invertedlefttrianglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n = 5;
	        int star = 5;
	        int space = 0;

	        for (int i = 1; i <= n; i++) {

	            // Print stars
	            for (int j = 1; j <= star; j++) {
	                System.out.print("* ");
	            }

	            // Print spaces
	            for (int k = 1; k <= space; k++) {
	                System.out.print(" ");
	            }

	            star--;
	            space++;
	            System.out.println();
	        }
	    }
	}
