package synchronization;

 class large {
	 synchronized void display(int a,int b)
	 {
		 if(a<b) {
			 System.out.println("Largest");
		 }
		 else {
			 System.out.println("smallest");
		 }
	 }
}
 public class largest{
	 public static void main(String[] args) {
		large l = new large();
		l.display(20, 30);
	}
 }
