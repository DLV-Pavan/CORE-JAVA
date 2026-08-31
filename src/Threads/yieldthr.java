package Threads;

 class numthr extends Thread {
	@Override
	public void run() {

	for(int i=0;i<=5;i++) {
		System.out.println(i);
		 Thread.yield();
	}
	}
}
class letterthread extends Thread{
	 @Override
	    public void run() {

	        for (char ch = 'A'; ch <= 'E'; ch++) {
	            System.out.println(ch);
	        }
	    }
	}
public class yieldthr{
	public static void main(String[] args) {
		numthr t1 = new numthr();
		letterthread t2 = new letterthread();
		t1.start();
		t2.start();
	}
	
}
	
	

