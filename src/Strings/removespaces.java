package Strings;

public class removespaces {
	public static void main(String[] args) {
        String s = "java development";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}


