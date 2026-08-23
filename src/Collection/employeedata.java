package Collection;
import java.util.*;

//employyee class data

class employee{
	int empid;
	String empname;
	double empsalary;
	
	//getters
	public int getempid() {
		return empid;
	}
	
	public String getempname() {
		return empname;
	}
	
	public double getempsalary() {
		return empsalary;
		
	}
	
	//setters
	public void setempid(int id) {
		this.empid = id;
	}
	
	public void setempname(String name) {
		this.empname = name;
	}
	
	public void setempsalary(double salary) {
		this.empsalary = salary;
	}
	
	public employee(int id,String name, double salary) {
		this.empid = id;
		this.empname = name;
		this.empsalary = salary;
	}
	
	@Override
	public String toString() {
		 return "Employee [ID: " + empid +
	                ", Name: " + empname +
	                ", salary: " + empsalary + "]";
	    }
}


public class employeedata {
	public static void main(String args[]) {
		//creating a list
		List<employee> list = new ArrayList<>();
		list.add(new employee(101,"pavan",30000));
		list.add(new employee(102,"venkat",40000));
		list.add(new employee(103,"lalith",50000));

		//reading
		System.out.println("employee details:");
		for(employee e: list) {
			System.out.println(e);
		}
		
		//updating
		int id = 102;
		for(employee e:list) {
			if(e.getempid()==id) {
				e.setempname("Pavan");
				e.setempsalary(60000);
				System.out.println("employee updated");
				break;
			}
		}
		
		//deleting
		
		int id1 = 103;
		employee deleteemployee = null;
		for(employee e:list) {
			if(e.getempid() == id1) {
				deleteemployee = e;
				break;
			}
		}
		
        if (deleteemployee != null) {

            list.remove(deleteemployee);

            System.out.println("Employee deleted");

        } else {

            System.out.println("Employee ID not found");
        }

        
        System.out.println("final employee details:");
        for(employee e:list) {
        	System.out.println(e);
        }

		
	}
	

}
