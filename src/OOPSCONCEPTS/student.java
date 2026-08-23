package OOPSCONCEPTS;

public class student {
	int id;
	static String name;
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	{
		System.out.println("Instance block1");
	}
	{
		System.out.println("Instance block2");
	}
	public static void main(String args[]) {
		student s1 = new student();
		s1.id=20;
		s1.name="ramu";
		System.out.println(s1.id+" "+s1.name);
		
		student s2 = new student();
		s2.id=10;
		s2.name="seetha";
		System.out.println(s2.id+" "+s2.name);
		
	}
	
	
	

}
