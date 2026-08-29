package Threads;

public class threadpriority extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Priority:" + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		threadpriority th = new threadpriority();
		th.setPriority(8);
		th.start();
	}
	
}
