package thread;

public class Restroom implements Runnable {
	private int remainRoom;
	private boolean flag;
	Restroom(int remainRoom) {
		this.remainRoom = remainRoom;
	}
	private Object obj = new Object();
	public void run() {
		flag = true;
		while (flag) {
			synchronized (obj) {
				// while(true) {
				this.used();
				// }
			}		
		}
	}
	public void used() {
		if (remainRoom > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "...剩余" + remainRoom--);
		} else {
			flag = false;
			return;
		}
	}
}
