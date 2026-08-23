package Problemsofarrays;

public class moveallzero {
	public static void main(String args[]) {
		int arr[] = {1, 0, 2, 0, 3, 4};
		int result[] = new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=0) {
				result[index]=arr[i];
				index++;
				
			}
		}
		System.out.println("array after moving zeros: ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}
	}
	
}
