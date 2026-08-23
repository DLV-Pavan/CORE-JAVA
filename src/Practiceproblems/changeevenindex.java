package Practiceproblems;

public class changeevenindex {
	public static void main(String args[]) {
		String s = "This is a java program";
		String[] words = s.split(" ");
		for(int i = 0;i<words.length;i++)
		
			if(i%2==0) {
				words[i]=words[i].toUpperCase();
		}
			else {
				String rev="";
				for(int j =words[i].length()-1;j>=0;j--) {
					rev = rev + words[i].charAt(j);
				}
			}
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]);
		}
		
	}

}
