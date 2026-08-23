package predefineexceptions;

public class studentmarks {
	public static void main(String args[]) {
		int marks = 50;
		
		try {
			if(marks < 0 || marks>100) {
				throw new IllegalArgumentException("invalid marks");
				
			}
			System.out.println("valid marks");
		}
		
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
