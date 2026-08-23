package set;
import java.util.*;
public class hashset {
	public static void main(String args[]) {
		Set<Integer> Set = new HashSet<>();
		Set.add(10);
		Set.add(20);
		Set.add(30);
		Set.add(40);
		Set.add(30);
		Set.add(null);

		Set<Integer> Set1 = new HashSet<>();
		Set1.add(10);
		Set1.add(20);
		Set1.add(30);
		Set1.add(40);
		
		System.out.println(Set);
		System.out.println(Set1.containsAll(Set1));
		
		Set.removeAll(Set1);
		System.out.println(Set1);
		
		
		
	}
	
}
