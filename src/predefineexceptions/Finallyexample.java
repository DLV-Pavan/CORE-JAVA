package predefineexceptions;

public class Finallyexample {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		try {
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("handle the exception");
		}
		finally {
			System.out.println("program execution successfully");
		}
	}
}
  