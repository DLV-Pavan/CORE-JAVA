package Strings;
public class counting{
public static void counting(String s) {
	int count = 0;
	s=s.toUpperCase();
    for(int i=0;i<s.length();i++) {
	char ch = s.charAt(i);
	if(ch=='E') {
		count++;
	}
}
System.out.println("count of e/E:" + count);
}

public static void main(String args[]) {
	
	counting("javaEEdeve");
}
}