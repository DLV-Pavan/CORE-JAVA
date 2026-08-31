package Threads;

 class task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
 }
	public class Numbertask{
	public static void main(String[] args) {
		task t = new task();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t1.start();
		t2.start();
	}
}
 
