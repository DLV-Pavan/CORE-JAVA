package Threads;


public class threadjoinnn extends Thread {
	@Override
	public void run() {
		for(int i = 1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		threadjoinnn tj = new threadjoinnn();
		tj.start();
		try {
			tj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread completed");
	}
}