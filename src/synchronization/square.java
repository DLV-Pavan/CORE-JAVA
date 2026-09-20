package synchronization;

class squ {
	synchronized void display(int n)
	{
		System.out.println("Square:" + n*n);
	}
}
public class square{
	public static void main(String[] args) {
		squ s = new squ();
		s.display(5);
	}
}
