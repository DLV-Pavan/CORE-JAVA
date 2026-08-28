package Exceptionpropogation;

public class nullpointexcep {
	static void m3() {
		String name = null;
		System.out.println(name.length());
	}
	static void m2() {
		m3();
	}
	
	static void m1() {
		try {
			m3();
		}
		catch(NullPointerException e) {
			System.out.println("String cannot be null");
		}
		
	}
	public static void main(String[] args) {
		m1();
	}
}
