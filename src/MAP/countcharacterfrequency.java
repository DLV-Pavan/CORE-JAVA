package MAP;
import java.util.*;
public class countcharacterfrequency {
public static void main(String[] args) {
	String s = "SUCCESS";
	HashMap<Character, Integer> hcr = new HashMap<>();
	for(char ch:s.toCharArray()) {
		if(hcr.containsKey(ch)) {
			hcr.put(ch, hcr.get(ch) + 1);
		}
		else {
			hcr.put(ch,1);
		}
	}
	
	for(Character ch : hcr.keySet()) {
		if(hcr.get(ch) == 1) {
			System.out.println(ch);
		}
		
	}
}
}
