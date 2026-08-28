package Customexceptions;
class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}
public class ageexception {
	public static void main(String[] args) {
		int age = 16;
		try {
			if(age>=18) {
				System.out.println("eligible to vote");
			}
			else {
				throw new InvalidAgeException("invalid age:you must be 18 or above");
			}
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
