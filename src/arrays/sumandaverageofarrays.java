package arrays;
import java.util.Scanner;
public class sumandaverageofarrays {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		System.out.println("Enter the array elements:");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		double average = sum / n;
		System.out.println(sum);
		System.out.println(average);
			
			
		}
	}


