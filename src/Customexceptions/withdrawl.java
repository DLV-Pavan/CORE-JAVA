package Customexceptions;
class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String message){
		super(message);
	}
}
public class withdrawl {
	public static void main(String[] args) {
		double balance = 5000;
		double withdrawl = 7000;
		try {
			if(withdrawl<=balance) {
				System.out.println("with draw successfully");
			}
			else {
				throw new InsufficientBalanceException("you did not have enough balance");
			}
		}
		catch(InsufficientBalanceException e) {
			System.out.println("insufficient balance");
		}
	}
}

