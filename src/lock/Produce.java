package lock;


public class Produce implements Runnable {
	private Commodity r;
	
	Produce(Commodity r){
		this.r = r;
	}

	public  void run()  {
		while(true) {
			r.set("面包");
		}
	}

}









/*		//synchronized (Commodity.obj) {
Commodity.lock.lock();
	while (Commodity.flag == false) {
		try {
			this.wait(10);
		} catch (InterruptedException e) {
		}
		Commodity.count++;
		System.out.println(Thread.currentThread().getName() + ".....生产者" + Commodity.count);
		boolean flag = true;
		finally {
			single(Consume);
		}			
		Commodity.lock.unlock();
//	}
}*/
