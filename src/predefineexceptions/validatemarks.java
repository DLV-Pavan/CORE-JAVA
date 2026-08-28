package predefineexceptions;

public class validatemarks {
	public static void main(String[] args) {
		int marks = 120;
		try {
			if(marks<=100) {
				System.out.println("valid marks");
			}
			else {
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e) {
			System.out.println("invalid marks");
		}
	}
}
