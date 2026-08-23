package constructor;

public class Student {
	int age;
	String name;
	
public Student(int sage, String sname) {
		age=sage;
		name=sname;
}

		public void display() {
			
			System.out.println("age: "+ age);
			System.out.println("name:"+ name);
		}
		
public static void main(String args[]) {
	Student s1 = new Student(23,"ram");
	Student s2 = new Student(24,"pavan");
	
	System.out.println("s1 details");
	s1.display();
	
	System.out.println("s2 details");
	s2.display();
	

	}

}
