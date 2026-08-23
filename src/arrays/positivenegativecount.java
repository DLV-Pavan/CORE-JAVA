package arrays;

public class positivenegativecount {
	public static void main(String args[]) {
		int arr[]= {10, -5, 20, -2, 0};
		int pos = 0;
		int neg = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				pos++;
			}
			else if(arr[i]<0) {
				neg++;
			}
			
		}
		
		System.out.println("positive count:" + pos);
		System.out.println("negative count:" + neg);

	}

}
