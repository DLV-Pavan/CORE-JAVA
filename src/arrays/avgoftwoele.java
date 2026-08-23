package arrays;

public class avgoftwoele {
	public static void main(String args[]) {
		int arr[] = {10, 20, 30, 40};
		int sum = 0;
		int avg = 0;

		for(int i = 0; i < arr.length; i++) {
			
		    sum = sum + arr[i];
		    avg = sum/4;
		}

		System.out.println("avg = " + avg);
	}

}
