package Collectionlist;

import java.util.LinkedList;

public class addelementposition {
	public static void main(String[] args) {
		LinkedList<Integer> ap = new LinkedList<>();
		ap.add(10);
		ap.add(20);
		ap.add(30);
		ap.add(40);
		
		ap.add(2, 25);
		System.out.println(ap);
	}

}
