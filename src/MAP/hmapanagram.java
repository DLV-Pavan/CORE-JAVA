package MAP;
import java.util.*;
public class hmapanagram {
	public static void main(String[] args) {
		String s[] = {"eat","tea","tan","ate","nat","bat"};
		Map<String, ArrayList<String>> map = new HashMap<>();
		
		for (int i = 0; i < s.length; i++) {
		    String str = s[i];
		    char ch[] = str.toCharArray();
		    Arrays.sort(ch);
		    String s1 = new String(ch);
		    if(map.containsKey(s1)) {
		    	map.get(s1).add(str);
		    }
		    else {
		    	ArrayList al = new ArrayList();
		    	al.add(str);
		    	map.put(s1, al);
		    }
		    
		}
		System.out.println(map);
		
	}

}
