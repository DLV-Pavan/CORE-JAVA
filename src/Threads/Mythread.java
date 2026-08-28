package Threads;

public class Mythread extends Thread {
	public static void main(String[] args) {
		Mythread m1 = new Mythread();
		Thread t1 = new Thread(m1);
		System.out.println(t1.getState());
		System.out.println("thread creation");
		t1.start();
		System.out.println("runnable start");
		
		try {
			t1.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("program completed");
	}
}
