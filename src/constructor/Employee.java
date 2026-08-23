package constructor;

public class Employee {
	int id;
	String name;
	String department;
	double salary;
	
	public Employee(int empid, String empname, String empdepartment, double empsalary) {
		id = empid;
		name = empname;
		department = empdepartment;
		salary = empsalary;
		
	}
	
	public void display() {
		System.out.println("Employee id:"+ id);
		System.out.println("name:"+ name);
		System.out.println("department:"+ department);
		System.out.println("salary:"+ salary);
		
		System.out.println();

	}
	
	
	
	public static void main(String args[]) {
		Employee e1 = new Employee(101,"Ravi","HR",35000);
		Employee e2 = new Employee(102,"Priya","Developer",55000);
		Employee e3 = new Employee(103,"Kiran","Testing",42000);
		
		e1.display();
		e2.display();
		e3.display();
		
	}

}