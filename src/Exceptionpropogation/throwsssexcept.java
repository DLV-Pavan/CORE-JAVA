package Exceptionpropogation;

public class throwsssexcept {
	static void m3() throws ArithmeticException{
		int a = 10;
		int b = 0;
		int result = a/b;
		System.out.println(result);
	}
	
	static void m2() {
		m3();
	}
	static void m1() {
		try {
			m2();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled in method1");
		}
	}
	public static void main(String[] args) {
		m1();
	}
}
