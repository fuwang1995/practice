package thread;

public class Synchronized {
	public static void main(String[] args) {
		Restroom r = new Restroom(10);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();	
	}

}
