package arrays;

public class jaggedstudentmarks {

	public static void main(String[] args) {
		int arr[][] = {
	            {80, 90},
	            {75, 85, 95, 70},
	            {88, 92, 81},
	            {65, 70, 75, 80, 85}
	        };

	        for (int i = 0; i < arr.length; i++) {

	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }

	            System.out.println(" ");
	        }
	    }
	
}
