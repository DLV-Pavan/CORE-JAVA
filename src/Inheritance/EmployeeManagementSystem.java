package Inheritance;

class Employee{
	private int employeeid;
	private String employeename;
	private double employeesalary;
	
	//parameterized
	public Employee(int employeeid, String employeename, double employeesalary)
	{
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}
	
	//getter
	
	public int getemployeeid()
	{
		return employeeid;
	}
	
	public String getemployeename()
	{
		return employeename;
	}
	
	public double getemployeesalary()
	{
		return employeesalary;
	}
	
	//setter
	
	public void setemployeeid(int employeeid)
	{
		this.employeeid = employeeid;
	}
	
	public void setemployeename(String employeename)
	{
		this.employeename = employeename;
	}
	
	public void setemployeesalary(double employeesalary)
	{
		this.employeesalary = employeesalary;
	}
	
	//display details
	public void displaydetails()
	{
		System.out.println("employee id: " + employeeid);
		System.out.println("employee name: " + employeename);
		System.out.println("employee salary: " + employeesalary);
	}
	
}

class Developer extends Employee
{
	private String programminglanguage;
	private String projectname;
	
	//parameterized
	
	public Developer(int employeeid, String employeename, double employeesalary, String programminglanguage, String projectname) {
		super(employeeid, employeename,employeesalary);
		this.programminglanguage = programminglanguage;
		this.projectname = projectname;
	}
	
	//override 
	@Override
	public void displaydetails() {
		super.displaydetails();
		System.out.println("programming language:" + programminglanguage);
		System.out.println("project name:" + projectname);
	}
}

class Tester extends Employee
{
	private String testingtool;
	private String automationtype;
	
	//parameterized
	
	public Tester(int employeeid, String employeename, double employeesalary, String programminglanguage, String projectname) {
		super(employeeid, employeename,employeesalary);
		this.testingtool = testingtool;
		this.automationtype = automationtype;
	}
	
	//override 
	@Override
	public void displaydetails() {
		super.displaydetails();
		System.out.println("testing tool:" + testingtool);
		System.out.println("automationtype:" + automationtype);
	}
}


	

public class EmployeeManagementSystem {
	public static void main(String args[]) {
		System.out.println("developer details.....");
		
		Developer dp = new Developer(201,"Anjali",65000,"Java","Online banking system");
		
		System.out.println("Tester details......");
		
		Tester ts = new Tester(202,"kiran",55000,"Selinum","Hybrid framework");
		
		dp.displaydetails();
		
		ts.displaydetails();
		
		
	}
}
