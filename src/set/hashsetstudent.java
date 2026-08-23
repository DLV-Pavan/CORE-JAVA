package set;

import java.util.*;

class Student {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class hashsetstudent {

    public static void main(String args[]) {

        Set<Student> set = new HashSet<>();

        set.add(new Student(101, "Pavan", 85));
        set.add(new Student(102, "Lalith", 90));
        set.add(new Student(103, "Venkat", 95));
        set.add(new Student(104, "Arjun", 99));

        System.out.println(set);
    }
}