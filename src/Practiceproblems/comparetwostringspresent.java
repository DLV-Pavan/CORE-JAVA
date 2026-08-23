package Practiceproblems;

public class comparetwostringspresent {


	    public static void main(String[] args) {

	        String s1 = "New York";
	        String s2 = "NWYR";

	        for (int i = 0; i < s1.length(); i++) {

	            char ch = Character.toUpperCase(s1.charAt(i));

	            if (s2.indexOf(ch) != -1) {
	                System.out.print(ch);
	            } else {
	                System.out.print("+");
	            }
	        }
	    }
	}
