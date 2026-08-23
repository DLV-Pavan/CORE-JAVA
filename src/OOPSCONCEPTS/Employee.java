package OOPSCONCEPTS;

public class Employee {
	int id;
	String empname;
	double salary;
	static String companyname="ABC Technologies";
	static {
		System.out.println("Company Information loaded");
	}
	{
		System.out.println("employee object created");
	}
	public static void main(String args[]) {
		Employee e1 = new Employee();
		e1.id = 101;
		e1.empname = "Rahul";
		e1.salary = 45000;
		
		Employee e2 = new Employee();
		e2.id = 102;
		e2.empname = "sneha";
		e2.salary = 52000;
		
		Employee e3 = new Employee();
		e3.id = 103;
		e3.empname = "Arjun";
		e3.salary = 60000;
		
		System.out.println();
		System.out.println("Company Name:" + companyname);

		
		System.out.println();
		
		System.out.println("Employee 1");
		System.out.println("ID:" + e1.id);
		System.out.println("Name:" + e1.empname);
		System.out.println("salary:" + e1.salary);
		
		System.out.println();
		
		System.out.println("Employee 2");
		System.out.println("ID:" + e2.id);
		System.out.println("Name:" + e2.empname);
		System.out.println("salary:" + e2.salary);
		
		System.out.println();
		
		System.out.println("Employee 3");
		System.out.println("ID:" + e3.id);
		System.out.println("Name:" + e3.empname);
		System.out.println("salary:" + e3.salary);
		
	}
}

