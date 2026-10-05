package Collectionlist;

import java.util.*;

public class removelast {
	public static void main(String[] args) {
		LinkedList<Integer> rl = new LinkedList<>();
		rl.add(10);
		rl.add(20);
		rl.add(30);
		rl.add(40);
		
		rl.removeLast();
		System.out.println(rl);
	}

}
