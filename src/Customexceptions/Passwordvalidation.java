package Customexceptions;
class PasswordException extends Exception{
	PasswordException(String message){
		super(message);
	}
}
public class Passwordvalidation {
	public static void checkpassword(String password) throws PasswordException
	{
		if(password.length() < 8) {
			throw new PasswordException("password must contain at least 8 characters.");
		}
		else {
			System.out.println("Password is valid");
		}
	}
	
	public static void main(String args[]) {
		String password = "java123";
		
		try {
			checkpassword(password);
		}
		catch(PasswordException e)
		{
			System.out.println(e.getMessage());
		}
	}
	

}

