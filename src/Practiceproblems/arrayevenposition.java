package Practiceproblems;

public class arrayevenposition {
	public static void main(String args[]) {
		String s = "Java is a object oriented programming language";
		String[] words = s.split(" ");
		 System.out.print("[");
		for(int i = 0;i<words.length;i++)
			
			if(i%2 != 0) {
				System.out.println("\"" + words[i] + "\"");
				
                if (i < words.length - 2) {
                	System.out.print(", ");
                }
			}
		System.out.println("]");
	}
	

	}


