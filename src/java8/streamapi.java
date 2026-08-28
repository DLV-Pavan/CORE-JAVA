package java8;
import java.util.*;
public class streamapi {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,40,5,30,60,10,40);
		//list.stream()
		//.forEach((n)->System.out.println(n));
		
		//.filter(n -> n>40)
		//.forEach((n)->System.out.println(n));
		//.filter(n -> n>20)
		//.forEach((n)->System.out.println(n));
		
		//.map(n->n+30)
		//.forEach((n)->System.out.println(n));

		//long count = list.stream()
		//.filter(n->n>10)
		//.count();
		//System.out.println(count);
		
		//Optional<Integer> max = list.stream()
		
		//.max((a,b)->Integer.compare(a, b));
		//System.out.println(max);
		//.max(Integer::compare);
		int max = list.stream()
		       // .filter(n -> n < 30)
		        //.max(Integer::compare)
		        //.get();

		//System.out.println(max);
		
		.reduce(0,(a,b)->a+b);
		System.out.println(max);
		
	}

}
