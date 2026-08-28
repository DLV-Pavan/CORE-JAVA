package Threads;

public class threadname extends Thread {
	@Override
	public void run() {
		System.out.println("Thread name:" + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		threadname tn = new threadname();
		 tn.setName("MyThread");
		tn.start();
		
	}
}
