package arrays;

public class sumofeachrow {

	public static void main(String[] args) {

	        int arr[][] = {
	            {5, 10, 10},
	            {6, 7, 5},
	            {10, 10, 10},
	            {7, 8, 7}
	        };

	        for (int i = 0; i < arr.length; i++) {
	            int sum = 0;

	            for (int j = 0; j < arr[i].length; j++) {
	                sum = sum + arr[i][j];
	            }

	            System.out.println(sum);
	        }
	    }
	}
