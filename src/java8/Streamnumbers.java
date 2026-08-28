package java8;
import java.util.*;
public class Streamnumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 65, 70, 85, 90);
		numbers.stream()
		.filter(n -> n>40)
		.filter(n -> n%2 == 0)
		.map(n -> n*n)
		.sorted(Comparator.reverseOrder())
		.forEach(n -> System.out.println(n));
		
	}

}
