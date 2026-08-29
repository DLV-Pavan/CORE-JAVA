package Threads;

public class threadgetset extends Thread{
	@Override
	public void run() {
		System.out.println("Thread name:" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		threadgetset t = new threadgetset();
		t.setName("PavanThread");
		t.start();
	}
}
