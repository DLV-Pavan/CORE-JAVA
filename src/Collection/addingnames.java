package Collection;

import java.util.ArrayList;

public class addingnames {
	public static void main(String[] args) {
		ArrayList <String> asr = new ArrayList<>();
		asr.add("Pavan");
		asr.add("Rahul");
		asr.add("Suresh");
		asr.add("Kiran");
		
		System.out.println(asr.set(1, "Ravi"));
		System.out.println(asr);
	}
}
