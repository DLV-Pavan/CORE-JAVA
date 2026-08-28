package predefineexceptions;

public class Divisionexample {
		static void divide(int a, int b) throws ArithmeticException{
			int result = a/b;
			System.out.println(result);
		}
		public static void main(String[] args) {
			int a = 10;
			int b = 0;
			
			try {
				divide(a,b);
		}
			catch(ArithmeticException e) {
				System.out.println("cannot divide by zero");
			}
	}

}
