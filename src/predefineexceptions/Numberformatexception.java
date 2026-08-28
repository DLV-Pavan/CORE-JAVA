package predefineexceptions;

public class Numberformatexception {
	public static void main(String[] args) {
		String s = "abc";
		try {
			int number = Integer.parseInt(s);
			System.out.println(number);
		}
		catch(NumberFormatException e) {
			System.out.println("invalid number format");
		}
	}
}
