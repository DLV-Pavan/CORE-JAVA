package Customexceptions;
class insufficientstock extends Exception{
	insufficientstock(String message)
	{
		super(message);
	}
}

public class onlineshoppingorder {
	public static void availablestock(int availablestock,int requestedquantity) throws insufficientstock
	{
		if(requestedquantity > availablestock)
		{
			throw new insufficientstock("Order confirmed successfully.");
		}
		
		else {
			System.out.println("order is not confirmed");
		}
	}
	
	public static void main(String args[])
	{
		int availablestock = 20;
		int requestedquantity = 25;
		
		try {
			availablestock(availablestock, requestedquantity );
		}
		catch (insufficientstock e) {
			System.out.println(e.getMessage());
		}
	}

}
