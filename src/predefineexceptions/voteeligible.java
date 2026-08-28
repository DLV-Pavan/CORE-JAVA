package predefineexceptions;

public class voteeligible {
	public static void main(String[] args) {
		int age = 15;
		try {
			if(age>=18) {
			System.out.println("the person is eligible to vote");
			
		}
		else {
			throw new ArithmeticException();
		}
	}
		catch(ArithmeticException e) {
			System.out.println("Not eligible to vote");
		}
	}
}
