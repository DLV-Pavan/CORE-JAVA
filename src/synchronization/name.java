package synchronization;

class yourname {
	synchronized void display(String name)
	{
		System.out.println("hello "+ name);
	}
}
public class name{
	public static void main(String[] args) {
		yourname yn = new yourname();
		yn.display("pavan");
	}
}
