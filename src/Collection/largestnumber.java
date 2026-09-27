package Collection;

import java.util.ArrayList;

public class largestnumber {
	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(40);
		al.add(30);
		
		int largest = al.get(0);
		for(int i:al) {
			if(i>largest) {
				largest = i;
			}
		}
			System.out.println("Largest num:" + largest);
		}
}

