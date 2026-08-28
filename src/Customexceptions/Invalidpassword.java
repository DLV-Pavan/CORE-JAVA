package Customexceptions;
class InvalidPasswordException extends Exception{
	InvalidPasswordException(String message) {
		super(message);
	}
}
public class Invalidpassword {
	public static void main(String[] args) {
		String password = "abc123";
		try {
			if(password.length() >= 8) {
				System.out.println("valid password");
			}
			else {
				throw new InvalidPasswordException("invalid password");
			}
		}
		catch(InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
