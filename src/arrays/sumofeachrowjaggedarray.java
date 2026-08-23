package arrays;

public class sumofeachrowjaggedarray {

	public static void main(String[] args) {
		int arr[][] = {
	            {10, 20},
	            {30, 40, 50},
	            {60},
	            {70, 80, 90, 100}
	        };

	        int total = 0;

	        for (int i = 0; i < arr.length; i++) {

	            int sum = 0;

	            for (int j = 0; j < arr[i].length; j++) {

	                System.out.print(arr[i][j] + " ");

	                sum = sum + arr[i][j];
	            }

	            System.out.println();

	            System.out.println(sum);

	            total = total + sum;
	        }

	        System.out.println(total);
	    }
	}