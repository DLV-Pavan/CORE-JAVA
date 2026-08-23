package Problemsofarrays;

public class positivenosend {

	    public static void main(String[] args) {

	        int arr[] = {-2, 5, -7, 3, 0, -1, 8};
	        int result[] = new int[arr.length];

	        int index = 0;

	        // Copy negative numbers and zero first
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] <= 0) {
	                result[index] = arr[i];
	                index++;
	            }
	        }

	        // Copy positive numbers
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > 0) {
	                result[index] = arr[i];
	                index++;
	            }
	        }

	        // Print result
	        System.out.print("Array after moving positive numbers: ");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + " ");
	        }
	    }
	}


