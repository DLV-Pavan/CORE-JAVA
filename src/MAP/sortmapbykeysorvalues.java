package MAP;
import java.util.*;
public class sortmapbykeysorvalues {
	public static void main(String[] args) {
		HashMap<String, Integer> hkey = new HashMap<>();
		hkey.put("rakesh", 75);
		hkey.put("pavan", 77);
		hkey.put("venkat", 78);
		hkey.put("lalith", 79);
		hkey.put("alluarjun", 71);
		
		TreeMap<String, Integer> tree = new TreeMap<>(hkey);
		
		System.out.println("Sorted by Keys:");
		System.out.println(tree);
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hkey.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> e1,
                    Map.Entry<String, Integer> e2) {

     return e1.getValue() - e2.getValue();
 }
});

System.out.println("Sorted by Values:");

for (Map.Entry<String, Integer> entry : list) {
 System.out.println(entry.getKey() + " → " + entry.getValue());
}
}
}