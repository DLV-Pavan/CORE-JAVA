package Collectionlist;

import java.util.LinkedList;

public class changeele {
	public static void main(String[] args) {
		LinkedList <Integer> cele = new LinkedList<>();
		cele.add(10);
		cele.add(20);
		cele.add(30);
		cele.add(40);
		
		cele.set(2, 35);
		System.out.println(cele);

	}

}
