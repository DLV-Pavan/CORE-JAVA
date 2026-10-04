package Collectionlist;

import java.util.LinkedList;

public class addelementbegining {
	public static void main(String[] args) {
		LinkedList<Integer> aeb = new LinkedList<>();
		aeb.add(20);
		aeb.add(30);
		aeb.add(40);
		
		aeb.addFirst(10);
		
		System.out.println(aeb);
	}

}
