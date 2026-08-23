package MAP;
import java.util.*;
public class hashcheckkeyandvalue {
	public static void main(String[] args) {
		HashMap<String, Integer> hst1 = new HashMap<>();
		hst1.put("Pavan",202);
		hst1.put("venkat",203);
		hst1.put("lalith",204);
		hst1.put("raj",205);
		hst1.put("kumar",206);
		
		System.out.println(hst1.containsKey("Pavan"));
		System.out.println(hst1.containsValue(205));

	}

}
