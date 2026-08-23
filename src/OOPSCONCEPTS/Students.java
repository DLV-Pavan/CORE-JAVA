package OOPSCONCEPTS;

public class Students {

    int id;
    static String name;
    static String coursename;

    static {
        System.out.println("Student Management System Started");
    }

    {
        System.out.println("Student Object Created");
    }

    {
        System.out.println("Student Object Created");
    }

    public static void main(String args[]) {

        Students s1 = new Students();
        s1.id = 101;
        s1.name = "Ravi";
        s1.coursename = "Java";
        System.out.println(s1.id + " " + s1.name + " " + s1.coursename);

        Students s2 = new Students();
        s2.id = 102;
        s2.name = "Priya";
        s2.coursename = "Python";
        System.out.println(s2.id + " " + s2.name + " " + s2.coursename);

    }

}