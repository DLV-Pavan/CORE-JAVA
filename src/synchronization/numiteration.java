package synchronization;

class iteration {
	synchronized void display()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
public class numiteration{
	public static void main(String[] args) {
		iteration in = new iteration();
		in.display();
	}
}
