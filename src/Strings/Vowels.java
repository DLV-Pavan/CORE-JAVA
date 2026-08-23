package Strings;

public class Vowels {
	public void countVowel(String s) {
		int count = 0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		
		}
		System.out.println("vowel count:" + count);
	}
	
	public static void main(String args[])
	{
		Vowels v= new Vowels();
		v.countVowel("javadev");
		
	}

}
