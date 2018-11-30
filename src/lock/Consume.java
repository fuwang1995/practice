package lock;
import java.util.concurrent.locks.*;

public class Consume implements Runnable {
	private Commodity r;
	Consume(Commodity r){
		this.r = r;
	}

	
	public  void run()  {
		while(true) {
			r.out();
		}

	}

}









/*		//synchronized (Commodity.obj) {
while (Commodity.flag == false) {
	try {
		this.wait(10);
	} catch (InterruptedException e) {
	}
	//Commodity.count++;
	System.out.println(Thread.currentThread().getName() + "..消费者" + Commodity.count);
	boolean flag = false;
	notify();
//}
}*/