package predefineexceptions;

public class Multipleexceptions {
	 public static void main(String[] args) {

	        int a = 10;
	        int b = 0;

	        int[] arr = new int[2];

	        try {
	            int result = a / b;
	            arr[5] = result;

	            System.out.println("Result: " + result);
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero.");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Invalid array index.");
	        }
	    }

}
