package java8;
import java.util.*;
public class Optionaldemo {
	public static void main(String args[]) {
		String name = "pavan";
		Optional<String> op = Optional.of(name);
		Optional<String> op1 = Optional.ofNullable(name);
		System.out.println(op1);
		Optional<String> op2 = Optional.empty();
		System.out.println(op1.isPresent());
		System.out.println(op1.orElse(name));
		op1.ifPresent((n)->System.out.println(n));
	}

}
