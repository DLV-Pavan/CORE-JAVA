package Strings;

public class CountJ {
			public static void countJ(String s) {
				int count = 0;
				s=s.toUpperCase();
			    for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch=='J') {
					count++;
				}
			}
			System.out.println("count of j/J:" + count);
			}
			
			public void countVowel(String s) {
				int vcount = 0;
				s=s.toLowerCase();
				for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
						vcount++;
					}
				}
				System.out.println("vowel count:" + vcount);
			}
			
			public void reverseString(String s) {
				String rev="";
				for(int i=s.length()-1;i>=0;i--) {
					char ch = s.charAt(i);{
					rev+=ch;
				}
			}
			
			System.out.println(rev);
}

			public static void main(String args[]) {
				CountJ cj = new CountJ();
				cj.countJ("Javajava");
				cj.countVowel("pavan");
				cj.reverseString("pavan");
			}
	}
	
			
			


