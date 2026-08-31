package Threads;

public class DaemonDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Daemon thread is running");
	}
	public static void main(String[] args) {
		DaemonDemo dd = new DaemonDemo();
		dd.setDaemon(true);
		dd.isDaemon();
		System.out.println(dd.isDaemon());
		dd.start();
	}

}
