package set;
import java.util.*;
public class linkedhashset {
	public static void main(String args[]) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);

		System.out.println("Linkedhashset:" + lhs);
		
		List<Integer> li = new ArrayList<>(lhs);
		System.out.println("List:" + li);
	}

}
