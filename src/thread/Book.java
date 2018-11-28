package thread;
//定义一本书
public class Book extends Thread {
	//书的页码
	private int unreadPage;
	Book(int unreadPage){
		this.unreadPage = unreadPage;
	}

	//方法：被阅览后的未读页数
	public void run(){
		
		while(true) {
			if(unreadPage>0) {	
				System.out.println(Thread.currentThread().getName()+"，未读页码数还有"+unreadPage--);	
			}else {
				return;
			}
			
		}
	
	}
}
