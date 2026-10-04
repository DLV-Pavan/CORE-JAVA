package Collectionlist;

import java.util.LinkedList;

public class removeele {
	public static void main(String[] args) {
		LinkedList<Integer> ar = new LinkedList<>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		ar.remove(2);
		
		System.out.println(ar);

	}

}
