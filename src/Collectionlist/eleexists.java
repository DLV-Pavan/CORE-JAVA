package Collectionlist;

import java.util.LinkedList;

public class eleexists {
	public static void main(String[] args) {
		LinkedList<Integer> ael = new LinkedList<>();
		ael.add(10);
		ael.add(20);
		ael.add(30);
		ael.add(40);
		ael.add(50);
		
		if(ael.contains(30))
		{
			System.out.println("30 is present");
		}
		
		else {
			System.out.println("30 is not present");
		}

	}

}
