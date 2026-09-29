package Collection;

import java.util.ArrayList;

public class addnames {
	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList<>();
		names.add("Pavan");
		names.add("Rahul");
		names.add("Suresh");
		names.add("Kiran");
		names.add("Arjun");
		
		System.out.println(names.remove("Suresh"));
		System.out.println(names);
		
		
	}
}
