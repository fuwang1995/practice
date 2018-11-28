package thread;

public class Pig implements Runnable{
	private  int breastCount ;
	Pig(int breastCount){
		this.breastCount = breastCount;
	}

	public void run() {
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(breastCount>0) {
				System.out.println(Thread.currentThread().getName()
						+"，剩余breast数量"+--breastCount);
			}else {
				return;
			}
		}
	}

	public int getBreastCount() {
		return breastCount;
	}
	

}
