package Customexceptions;
class expiredatmcard extends Exception{
	expiredatmcard(String message){
		super(message);
	}
}

public class ATMcardtransaction {
	public static void atmstatus(boolean cardExpired, boolean cardExpired1) throws expiredatmcard 
	{
		if(cardExpired)
		{
			throw new expiredatmcard("Transaction allowed");
		}
		
		else {
			System.out.println("Transaction not allowed.");
		}
	}
	
	public static void main(String args[]) {
		boolean cardExpired = true;
		boolean cardExpired1 = false;
		
		try {
			atmstatus(cardExpired, cardExpired1);
		}
		catch(expiredatmcard e)
		{
			System.out.println(e.getMessage());
			
		}
	}

}
