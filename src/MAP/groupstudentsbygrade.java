package MAP;

import java.util.*;

class Student {

    private int id;
    private String name;
    private String grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class groupstudentsbygrade {

    public static void main(String[] args) {

        // Input: List of students
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Pavan", "A"));
        students.add(new Student(2, "Venkat", "B"));
        students.add(new Student(3, "Lalith", "A"));
        students.add(new Student(4, "Alluarjun", "C"));
        students.add(new Student(5, "Kumar", "B"));
        students.add(new Student(6, "Ravi", "A"));

        // Output: Map<Grade, List<Student>>
        HashMap<String, List<Student>> hmap = new HashMap<>();

        // Group students according to grade
        for (Student s : students) {
            // Check whether grade is already present
            if (!hmap.containsKey(s.getGrade())) {

                // If grade is not present, create a new list
                hmap.put(s.getGrade(), new ArrayList<>());
            }

            // Add student to the corresponding grade
            hmap.get(s.getGrade()).add(s);
        }

        // Print result
        System.out.println(hmap);
    }
}