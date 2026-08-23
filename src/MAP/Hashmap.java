package MAP;
import java.util.*;
public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "rakesh");
		hmap.put(102, "ramesh");
		hmap.put(103, "ganesh");
		hmap.put(104, "pavan");
		
		System.out.println(hmap);
		
		for(Integer key: hmap.keySet()) {
			System.out.println(key + ":" + hmap.get(key));
		}
		for(Map.Entry<Integer, String> entry:hmap.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getValue());
		}
		
		System.out.println(hmap.values());
	System.out.println(hmap.containsKey(100));
	System.out.println(hmap.get(100));
		System.out.println(hmap.containsValue("ramesh"));
		System.out.println(hmap.size());
		
		hmap.remove(104);
		System.out.println(hmap);

		
		

	}

}
