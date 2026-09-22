package synchronization;

class mar {
	synchronized void display(int marks)
	{
		if(marks > 35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
}
public class marks{
	public static void main(String[] args) {
		mar m = new mar();
		m.display(75);
	}
}
