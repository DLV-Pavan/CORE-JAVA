package synchronization;

 class numadd {
	 synchronized void display(int a,int b)
	 {
		 System.out.println("sum: " + (a+b));
	 }
}
 public class addition{
	 public static void main(String[] args) {
		numadd ad = new numadd();
		ad.display(10,20);
	}
 }
