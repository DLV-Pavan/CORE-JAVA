package Threads;

public class threadcurrthr extends Thread {
	@Override
	public void run() {
		System.out.println("Child Thread:" + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		threadcurrthr tc = new threadcurrthr();
	    System.out.println("Main thread: " + Thread.currentThread().getName());
	    tc.setName("Mythread");
	    tc.start();
		
	}

}
