package Threads;

public class InterruptStatus extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			System.out.println("Thread interrupted");
            Thread.currentThread().interrupt();
        }
    }
				public static void main(String[] args) {
					InterruptStatus is = new InterruptStatus();
					is.start();
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						 e.printStackTrace();
			        }

			        is.interrupt();

			        System.out.println(is.isInterrupted());
			    }
			}