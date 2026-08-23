package Strings; 

public class removesmallletters {
	public static void main(String args[]) {
		String s = "jAvA DeVeloPer";
		String result = "";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
		
			if(ch<='a' && ch<='z') {
				result = result + ch;
			}
	}
		System.out.println(result);

}
}
