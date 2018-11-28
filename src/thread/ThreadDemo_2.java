package thread;

public class ThreadDemo_2 {
	public static void main(String[] args) throws InterruptedException {
		Pig p = new Pig(24);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		Thread t4 = new Thread(p);
	/*	for (int i = 0; i < 5; i++) {
			new Thread(p).start();
		}
	*/
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}
}
