package Collectionlist;

import java.util.*;
public class removefirst {
	public static void main(String[] args) {
		LinkedList<Integer> rf = new LinkedList<>();
		rf.add(10);
		rf.add(20);
		rf.add(30);
		rf.add(40);
		
		rf.removeFirst();
		System.out.println(rf);
		//System.out.println(rf.removeFirst(0));
	}

}
