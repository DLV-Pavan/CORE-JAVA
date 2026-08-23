package Strings;
public class reverse {


void reverse(String s) {
	String rev = "";
	for(int i=s.length()-1;i>=0;i--) {
	char ch = s.charAt(i);{
	rev+=ch;
}
}
	System.out.println(rev);
}

public static void main(String args[]) {
	reverse r = new reverse();
	r.reverse("javadev");
}
}


	

