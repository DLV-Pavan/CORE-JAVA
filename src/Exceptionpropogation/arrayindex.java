package Exceptionpropogation;
public class arrayindex {
	static void m3() {
		int arr[] = {10,20,30};
		System.out.println(arr[5]);
	}
	static void m2() {
		m3();
	}
	static void m1() {
		try {
			m2();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid array index");
		}
	}
	
	public static void main(String[] args) {
		m1();
	}
}
