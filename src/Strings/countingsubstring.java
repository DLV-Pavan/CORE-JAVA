package Strings;

public class countingsubstring {
	public static void main(String args[]) {
		String str = "we work to live and live to be happy live";  
		String word = "live";  
		
		int count = 0;

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

	}


