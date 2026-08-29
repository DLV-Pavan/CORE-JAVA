package Threads;

public class threadstate extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getState());
	}
	public static void main(String[] args) {
		threadstate ts = new threadstate();
		System.out.println(ts.getState());
		ts.start();
	}
}
