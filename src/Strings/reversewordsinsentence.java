package Strings;

public class reversewordsinsentence {
	public static void main(String args[]) {
		String s = "I Love java";
		String rev="";
		String arr[] = s.split(" ");
		for(int i = arr.length - 1; i>=0;i--) {
			rev = rev + arr[i];
		}
		System.out.println(rev);
	}

}
