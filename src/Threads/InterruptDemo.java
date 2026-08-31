package Threads;

public class InterruptDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Thread started");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
		System.out.println("Thread interrupted");
}
	}
	public static void main(String[] args) {
		InterruptDemo t1 = new InterruptDemo();
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.interrupt();
	}
}
