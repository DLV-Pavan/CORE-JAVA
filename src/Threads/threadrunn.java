package Threads;

public class threadrunn extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		threadrunn trr = new threadrunn();
		trr.start();
		
	}
}
