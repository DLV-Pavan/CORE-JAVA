package Threads;

 class Mytask implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable thread is running");
	}
}
 public class Runnabledemo{
	 public static void main(String[] args) {
		 Mytask mt = new Mytask();
		 Thread rd = new Thread(mt); 
		 rd.start();
	}
 }
 
