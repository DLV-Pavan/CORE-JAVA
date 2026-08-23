package arrays;
import java.util.Scanner;
public class reverseanarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the array size elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		
	}

}
