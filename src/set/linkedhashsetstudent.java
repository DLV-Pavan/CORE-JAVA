package set;
import java.util.*;

class Employee{
	int id;
	String name;
	int marks;
	
	Employee(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return id + " " + name + " " + marks;
	}
}
public class linkedhashsetstudent {
	public static void main(String args[]) {
		LinkedHashSet<Employee> lhs = new LinkedHashSet<>();
		lhs.add(new Employee(220, "pavan", 38));
		lhs.add(new Employee(221, "venkat", 40));
		lhs.add(new Employee(222, "lalith", 42));
		lhs.add(new Employee(223, "alluarjun", 44));

		System.out.println(lhs);
		
	}

}
