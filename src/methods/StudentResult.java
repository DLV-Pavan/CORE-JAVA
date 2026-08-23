package methods;
import java.util.Scanner;

public class StudentResult {

	    static int m1, m2, m3, m4, m5;
	    static int total;
	    static double average;
	    static String grade;

	    static void acceptMarks() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Marks 1: ");
	        m1 = sc.nextInt();

	        System.out.print("Enter Marks 2: ");
	        m2 = sc.nextInt();

	        System.out.print("Enter Marks 3: ");
	        m3 = sc.nextInt();

	        System.out.print("Enter Marks 4: ");
	        m4 = sc.nextInt();

	        System.out.print("Enter Marks 5: ");
	        m5 = sc.nextInt();
	    }

	    static void calculateTotal() {
	        total = m1 + m2 + m3 + m4 + m5;
	    }

	    static void calculateAverage() {
	        average = total / 5.0;
	    }

	    static void findGrade() {
	        if (average >= 90)
	            grade = "A+";
	        else if (average >= 80)
	            grade = "A";
	        else if (average >= 70)
	            grade = "B";
	        else if (average >= 60)
	            grade = "C";
	        else
	            grade = "Fail";
	    }

	    static void displayResult() {
	        System.out.println("Total = " + total);
	        System.out.println("Average = " + average);
	        System.out.println("Grade = " + grade);
	    }

	    public static void main(String[] args) {
	        acceptMarks();
	        calculateTotal();
	        calculateAverage();
	        findGrade();
	        displayResult();
	    }
	}
