package arrays;
import java.util.Scanner;
public class evenpositionssumelements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		System.out.println("Enter the size of array:");
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			if(i%2==0) {
				sum = sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
