package methods;

public class additionperformance {
	static int a = 10;
	static int b = 20;
	void display()
	{
		System.out.println(a+b+"hello");
	}
	static void checkbalance() {
		
		System.out.println("Checkbalance");
		
	}
	
	public static void main(String[] args) {
		additionperformance aps=new additionperformance();
		checkbalance();
		aps.display();
		System.out.println("main method started");
	}
}
