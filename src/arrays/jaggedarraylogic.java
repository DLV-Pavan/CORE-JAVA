package arrays;
import java.util.Scanner;
public class jaggedarraylogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter jagged array size:");
		int n = sc.nextInt();
		int arr[][] = new int[n][];
		for(int i=0;i<n;i++) {
			System.out.println("enter the no of cols1:");
			int col = sc.nextInt();
			arr[i]=new int[col];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the values:");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
