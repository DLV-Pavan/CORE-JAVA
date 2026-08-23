package Problemsofarrays;

public class merge {
	public static void main(String args[]) {
		int arr1 [] [] = {{1,2},{3,4}};
		int arr2 [] [] = {{5,6},{7,8}};
		
		int arr3[][][] = {arr1,arr2};
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println("array" + (i+1));
			
			for(int j=0;j<arr3[i].length;j++) {
				for(int k=0;k<arr3[i][j].length;k++) {
					System.out.print(arr3[i][j][k] + " ");
				}
				
				System.out.println();

			}
			
			

		}
	}
}
