package Strings;
public class palindrome {

public void palindrome(String s) {
	String s1 = "";
	for(int i = s.length() - 1; i >= 0; i--) {
	char ch = s.charAt(i);
	{
		s1 = s1 + ch;
		
	}
	}
	if(s.equals(s1))
	{
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}

}

public static void main(String args[]) {
	palindrome p = new palindrome();
	p.palindrome("madam");
}
}
