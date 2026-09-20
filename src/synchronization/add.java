package synchronization;

 class hroo {
	 static synchronized void display()
	 {
		 System.out.println("hello");
	 }
}
 public class add{
	 public static void main(String[] args) {
		hroo.display();
	}
 }
