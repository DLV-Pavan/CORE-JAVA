package synchronization;

 class hello {
	 synchronized void display(int n) {

	        System.out.println("Number: " + n);
	    }
	}

 public class number{
	 public static void main(String[] args) {
		hello d = new hello();
		d.display(10);
	}
 }

