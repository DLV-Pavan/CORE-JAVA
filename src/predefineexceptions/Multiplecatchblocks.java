package predefineexceptions;

public class Multiplecatchblocks {
	public static void main(String[] args) {
		int arr[] = {10,20,30};
		try {
			int a = 10;
			int b = 0;
			int result = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled successfully");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled successfully");
		}
	}
}
