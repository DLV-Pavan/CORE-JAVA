package MAP;
import java.util.*;
public class addandretrievestudents {
	public static void main(String[] args) {
		HashMap <String, Integer> hst = new HashMap<>();
		hst.put("Pavan",89);
		hst.put("rakesh",90);
		hst.put("siva",91);
		hst.put("venkat",92);
		hst.put("lalith",93);
		
		System.out.println(hst.get("Pavan"));

		
	}

}
