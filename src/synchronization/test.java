package synchronization;

 class Demo {
	 synchronized void display()
	 {
		 System.out.println("hello");
	 }
}
 public class test{
	 public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}
 }
