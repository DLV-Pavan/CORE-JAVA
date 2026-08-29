package Threads;

public class threadalivee extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		threadalivee tal = new threadalivee();
		System.out.println(tal.isAlive());
		tal.start();
		System.out.println(tal.isAlive());
		
		try {
			tal.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tal.isAlive());
	}
}
