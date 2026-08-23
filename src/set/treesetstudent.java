package set;
import java.util.*;

class students{
	int id;
	String name;
	int marks;
	
	students(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return id + " " + name + " " + marks;
	}
}

class studentsComparator implements Comparator<students>{
	public int compare(students s1, students s2) {
		if(s1.id > s2.id) {
			return 1;
		}
		else if (s1.id < s2.id) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
public class treesetstudent {
	public static void main(String args[]) {
		TreeSet<students> tst = new TreeSet<>(new studentsComparator());
		tst.add(new students(102,"pavan",89));
		tst.add(new students(100,"lalith",99));
		tst.add(new students(107,"venkat",98));

		System.out.println(tst);
		
	}

}
