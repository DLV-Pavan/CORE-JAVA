package java8;
import java.util.*;
public class Secondhighest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 50, 30, 80, 50, 90, 70, 90, 60);
		int Secondhighest = numbers.stream()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.get();
		System.out.println("Second highest number:" + Secondhighest);
		
	}
}
