package Collection;

import java.util.ArrayList;

public class sumofnumbers {
	public static void main(String[] args) {
		ArrayList <Integer> as = new ArrayList<>();
		as.add(10);
		as.add(20);
		as.add(30);
		as.add(40);
		as.add(50);
		
		int sum = 0;
		for(int i:as) {
			sum = sum+i;
		}
		System.out.println("Sum = "+sum);
	}

}
