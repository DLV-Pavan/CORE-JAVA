package predefineexceptions;

public class Arrayexception {
	public static void main(String args[]) {
		int arr[] = {10,20,30,40,50};
		try {
			System.out.println(arr[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot access 6th element. Array has only 5 elements.");
		}
	}
}
