package predefineexceptions;

public class atmwithdraw {
	public static void main(String args[]) {
		int balance = 5000;
		int withdraw = 6000;
		
		try {
            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient balance");
            }

            balance = balance - withdraw;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}