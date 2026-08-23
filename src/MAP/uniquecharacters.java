package MAP;
import java.util.*;
public class uniquecharacters {
	public static void main(String[] args) {
		String s = "Hello world Hello java world";
		HashMap<String,Integer> hmap = new HashMap<>();
		String[] words = s.split(" ");
		for(int i = 0;i<words.length;i++) {
			String word = words[i];
			if(hmap.containsKey(word)) {
                hmap.put(word, hmap.get(word) + 1);

			}
			else {
				hmap.put(word, 1);
			}
			
			
		}
		System.out.println(hmap);
	}
}
