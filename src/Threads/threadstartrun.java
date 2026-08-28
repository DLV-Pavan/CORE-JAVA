package Threads;

public class threadstartrun extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running");
	
}
	public static void main(String[] args) {
		threadstartrun tsr = new threadstartrun();
		tsr.run();
		Thread t1 = new Thread();
		t1.start();
		System.out.println("main method");
	}
}
