package Collection;

import java.util.ArrayList;

public class elementispresent {
	public static void main(String[] args) {
		ArrayList <Integer> ep = new ArrayList<>();
		ep.add(10);
		ep.add(20);
		ep.add(30);
		ep.add(40);
		ep.add(50);
		
		if(ep.contains(30)) {
			System.out.println("30 is present");
		}
		else {
			System.out.println("30 is not present");
		}
	}
}
