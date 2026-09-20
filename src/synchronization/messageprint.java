package synchronization;

class message {
	synchronized void display()
	{
		System.out.println("hello name");
	}
}
public class messageprint{
	public static void main(String[] args) {
		message m = new message();
		m.display();
	}
}
