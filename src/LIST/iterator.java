package LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

        al.add("teja");
        al.add("sarayu");
        al.add("arjun");
        al.add("bharath");
        al.add("unknown");
        al.add("nikhil");
        al.add("krish");

        System.out.println(al);
        
        Iterator<String> it = al.iterator();
        while(it.hasNext()) {
        	String name = it.next();
        	if(name.contains("a")) {
        		it.remove();
        	}
        }
        System.out.println(al);
	}

}