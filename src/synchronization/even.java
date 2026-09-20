package synchronization;

class eve {
	synchronized void display(int n)
	{
		if(n%2==0)
		{
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
}
public class even{
	public static void main(String[] args) {
		eve e = new eve();
		e.display(19);
	}
}
