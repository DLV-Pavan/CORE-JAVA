package Customexceptions;
class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String message){
	super(message);
}
}
public class insufficientbalance {
	 static void withdraw(double balance, double amount)
	            throws InsufficientBalanceException {

	        if (amount > balance) {
	            throw new InsufficientBalanceException("Insufficient balance");
	        }

	        System.out.println("Withdrawal successful");
	    }

	 public static void main(String[] args) {
		double balance = 5000;
		double withdraw = 7000;
		
		try {
			withdraw(balance, withdraw);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
