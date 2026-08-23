package MAP;
import java.util.*;
public class Anagrams {
	public static void main(String[] args) {
		String a[] = {"bat", "tab", "cat", "act", "tac"};
		
		HashMap<String, ArrayList<String>> hmap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
		    String str = a[i];
		    char ch[] = str.toCharArray();
		    Arrays.sort(ch);
		    String s1 = new String(ch);
		    if(hmap.containsKey(s1)) {
		    	hmap.get(s1).add(str);
		    }
		    else {
		    	ArrayList<String> al = new ArrayList();
		    	al.add(str);
		    	hmap.put(s1, al);
		    }
		    
		}
		System.out.println(hmap);
		
	}

}
