package Exceptionpropogation;

public class numberformatexception {
	static void m3() {
		String s = "abc";
		System.out.println(Integer.parseInt(s));
	}
	static void m2() {
		m3();
	}
	static void m1() {
		try {
			m3();
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid number format");
		}
	}
	public static void main(String[] args) {
		m1();
	}
}
