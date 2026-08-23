package arrays;
import java.util.Scanner;
public class copyarrayintoanother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        System.out.println("Enter the array elements:");

        // Read elements into the first array
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copy elements to the second array
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Copied array elements:");

        // Print the copied array
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
	}
}

	