package Strings;

public class removedigits {
	public static void main(String args[]) {
		String s = "ja123vaDEveloper";
		String result = "";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch >= '0' && ch >= '9') {
				result = result + ch;
			}
		}
		
		System.out.println(result);
		

}
}
