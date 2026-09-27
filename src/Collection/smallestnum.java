package Collection;

import java.util.ArrayList;

public class smallestnum {
	public static void main(String[] args) {
		ArrayList <Integer> asm = new ArrayList<>();
		asm.add(30);
		asm.add(10);
		asm.add(50);
		asm.add(20);
		asm.add(40);
		
		int smallest = asm.get(0);
		for(int i:asm) {
			if(i<smallest) {
				smallest = i;
			}
		}
		System.out.println("Smallest num:" + smallest);
	}
}
