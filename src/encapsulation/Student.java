package encapsulation;

class Student {

    String name;
    String course;
    double fee;

    // Constructor with only name
    Student(String name) {
        this.name = name;
        this.course = "Not Selected";
        this.fee = 0;
    }

    // Constructor with name and course
    Student(String name, String course) {
        this.name = name;
        this.course = course;
        this.fee = 0;
    }

    // Constructor with name, course and fee
    Student(String name, String course, double fee) {
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    // Method to display details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Fee: " + fee);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student("Pavan");
        Student s2 = new Student("Rahul", "Java");
        Student s3 = new Student("Priya", "Python", 25000);

        s1.display();
        s2.display();
        s3.display();
    }
}