package Threads;

public class threadslp extends Thread {
	@Override
	public void run() {
		System.out.println("Thread started");
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread completed");
	}
	public static void main(String[] args) {
		threadslp tlp = new threadslp();
		tlp.start();
	}
}
