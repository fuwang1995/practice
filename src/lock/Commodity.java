package lock;
import java.util.concurrent.locks.*;
//需求一个商品类
public class Commodity { 
	private String name ;
	private int count = 1 ;
	private boolean flag = false;
	
	public synchronized void set(String name) { 
		
		while(flag) 
			try {this.wait();} catch (InterruptedException e) {} //t1 
		this.name = name + count;	
		count++;
		System.out.println(Thread.currentThread().getName()+
				".....生产者"+this.name);
		flag = true;
			this.notifyAll();	
		
	}
	
	public synchronized void out() {
		while(!flag )
			try {this.wait();} catch (InterruptedException e) {}	
		System.out.println(Thread.currentThread().getName()+
				"..消费者"+this.name);	
		flag = false;
			this.notifyAll();	
	}
}

















/*private String name;
public static int count=1;
public static boolean flag = false;
//public static Object obj = new Object();
//定义一个锁对象。
public static Lock lock = new ReentrantLock();
//获取锁上的Condition对象。
Condition con1 = lock.newCondition();
Condition con2 = lock.newCondition();
Commodity(String name) {
	this.name = name + count;// 商品的名字及编号
}*/