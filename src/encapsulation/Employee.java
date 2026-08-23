package encapsulation;

class employeesalary {

    // Method with basic salary
    double calculateSalary(double basicSalary) {
        return basicSalary;
    }

    // Method with basic salary and bonus
    double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }

    // Method with basic salary, bonus and overtime
    double calculateSalary(double basicSalary, double bonus, double overtime) {
        return basicSalary + bonus + overtime;
    }

    void display() {

        System.out.println("Salary using basic salary: " + calculateSalary(30000));

        System.out.println("Salary using basic salary and bonus: "
                + calculateSalary(30000, 5000));

        System.out.println("Salary using basic salary, bonus and overtime: "
                + calculateSalary(30000, 5000, 3000));

        System.out.println();
    }
}

public class Employee {

    public static void main(String[] args) {

        employeesalary e1 = new employeesalary();

        e1.display();
    }
}