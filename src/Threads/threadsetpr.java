package Threads;

class threadset extends Thread {
	@Override
	public void run() {
		System.out.println("First thread priority:");
	
		System.out.println(currentThread().getPriority());
	}
}
	class threadset2 extends Thread{
		@Override
		public void run() {
			System.out.println("Second thread priority:");
			System.out.println(currentThread().getPriority());
		}
	}
	
	public class threadsetpr{
	public static void main(String[] args) {
		threadset t1 = new threadset();
		threadset2 t2 = new threadset2();
		t1.setPriority(3);
		t2.setPriority(8);
		
		t1.start();
		t2.start();
	}
	}

