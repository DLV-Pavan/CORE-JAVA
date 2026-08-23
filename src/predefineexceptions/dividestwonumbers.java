package predefineexceptions;

public class dividestwonumbers {
	public static void main(String args[]) {
		int a = 10;
		int b = 2;
		
		try {
			int result = a/b;
			System.out.println(result);
			System.out.println("division successfull");
		}
		
		finally {
			System.out.println("Program execution completed");
		}
	}

}
