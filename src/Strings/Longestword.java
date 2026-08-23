package Strings;

public class Longestword {
	public static void main(String args[]) {
		
	String str = "I am a java developer";

	String[] words = str.split(" ");

	String longest = words[0];

	for (int i = 1; i < words.length; i++) {

	    if (words[i].length() > longest.length()) {
	        longest = words[i];
	    }
	}

	System.out.println("Longest Word: " + longest);
}
}
