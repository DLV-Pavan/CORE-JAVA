package predefineexceptions;

public class candidateage {
	public static void main(String args[]) {
		int age = 22;
		
		try {
			if(age<18) {
				throw new ArithmeticException("INVALID AGE");
			}
			System.out.println("valid age");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());

		}
		
		finally {
            System.out.println("Registration process completed.");
        }
	}

}
